package de.vrsoft.springboot.demo.kontaktliste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kontakte")
public class KontaktController { 
	@Autowired
	KontaktSpeicher speicher;

@RequestMapping(method=RequestMethod.GET)
  public List<Kontakt> getAll() {
    return speicher.findAll();
  }
  
  @RequestMapping(method=RequestMethod.POST)
  public Kontakt create(@RequestBody Kontakt kontakt) {
    return speicher.save(kontakt);
  }
  
  @RequestMapping(method=RequestMethod.DELETE, value="{id}")
  public void delete(@PathVariable String id) {
	  speicher.delete(id);
  }
  
  @RequestMapping(method=RequestMethod.PUT, value="{id}")
  public Kontakt update(@PathVariable String id, @RequestBody Kontakt kontakt) {
	  Kontakt update = speicher.findOne(id);
	    update.setAddress(kontakt.getAddress());
	    update.setEmail(kontakt.getEmail());
	    update.setFacebookProfile(kontakt.getFacebookProfile());
	    update.setFirstName(kontakt.getFirstName());
	    update.setGooglePlusProfile(kontakt.getGooglePlusProfile());
	    update.setLastName(kontakt.getLastName());
	    update.setLinkedInProfile(kontakt.getLinkedInProfile());
	    update.setPhoneNumber(kontakt.getPhoneNumber());
	    update.setTwitterHandle(kontakt.getTwitterHandle());
	    return speicher.save(update);
  }

}