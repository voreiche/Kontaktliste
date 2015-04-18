package de.vrsoft.springboot.demo.kontaktliste;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KontaktSpeicher extends MongoRepository<Kontakt, String> {};
