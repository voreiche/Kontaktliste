# Kontaktliste
Verwaltung von Kontakten mittels Spring Boot und MongoDB

##Vorgehen
1. Erstellen des Grundgrüsts für des Projekt mittels http://start.spring.io/.
![alt text](spring_boot_initialzr.tiff "Spring Boot Initializr")

1.1 Mit dieser Webseite läßt sich ein Projektgrundgerüst bestehend aus Verzeichnisstruktur, zu verwendende Module (Spring Komponenten, Datenbanksysteme, Template-Engines, pom.xml etc.) auswählen und zu einer Zip-Datei zusammenpacken.
Dieses Zip-Archiv kann dann in einem beliebigen Verzeichnis entpackt und in eine IDE importiert werden.

1.2 Zip-Archiv erstellen [demo.zip](demo.zip).

![alt text](spring_boot_initialzr_generate_project_button.tiff "Projekt erstellen")

1.3 In Eclipse über "Import Existing Maven Project" das Projekt importieren

![alt text](eclips_import_maven_project.tiff "Maven Projekt importieren")

1.4 Zip-Archiv herunterladen und den Inhalt des demo-Verzeichnisses auspacken.

![alt text](eclipse_project_layout.tiff "Verzeichnisstruktur")

##Die Maven-Projekt-Datei:
``` xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	
	<groupId>de.vrsoft.springboot</groupId>
	<artifactId>demo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>kontaktliste</name>
	<description>Demo project für Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.2.3.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<start-class>de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplication</start-class>
		<java.version>1.7</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-mongodb</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
´´´

3. Maven Projekt bauen und ausführen lassen
<pre>
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the builder org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder with a thread count of 1
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building kontaktliste 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ demo ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/volkerreichel/Projects/GitHub/Kontaktliste/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ demo ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ demo ---
[INFO] Surefire report directory: /Users/volkerreichel/Projects/GitHub/Kontaktliste/target/surefire-reports
>>>>>>> origin/master

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests
20:13:50.095 [main] DEBUG o.s.t.c.j.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests].
20:13:50.127 [main] DEBUG o.s.test.context.BootstrapUtils - Instantiating TestContextBootstrapper from class [org.springframework.test.context.web.WebTestContextBootstrapper]
20:13:50.191 [main] DEBUG o.s.t.c.w.WebTestContextBootstrapper - Found explicit ContextLoader class [org.springframework.boot.test.SpringApplicationContextLoader] for context configuration attributes [ContextConfigurationAttributes@27c20538 declaringClass = 'de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests', classes = '{class de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplication}', locations = '{}', inheritLocations = true, initializers = '{}', inheritInitializers = true, name = [null], contextLoaderClass = 'org.springframework.boot.test.SpringApplicationContextLoader']
20:13:50.221 [main] DEBUG o.s.t.c.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.238 [main] DEBUG o.s.t.c.w.WebTestContextBootstrapper - @TestExecutionListeners is not present for class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]: using defaults.
20:13:50.280 [main] INFO  o.s.t.c.w.WebTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
20:13:50.338 [main] INFO  o.s.t.c.w.WebTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@1f7030a6, org.springframework.test.context.support.DependencyInjectionTestExecutionListener@5a1c0542, org.springframework.test.context.support.DirtiesContextTestExecutionListener@396f6598, org.springframework.test.context.transaction.TransactionalTestExecutionListener@394e1a0f, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@27a5f880]
20:13:50.344 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.345 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.348 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.348 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.359 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.360 [main] DEBUG o.s.t.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests]
20:13:50.594 [main] DEBUG o.s.core.env.StandardEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
20:13:50.598 [main] DEBUG o.s.core.env.StandardEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
20:13:50.599 [main] DEBUG o.s.core.env.StandardEnvironment - Initialized StandardEnvironment with PropertySources [systemProperties,systemEnvironment]
20:13:50.603 [main] DEBUG o.s.core.env.StandardEnvironment - Adding [integrationTest] PropertySource with search precedence immediately lower than [systemEnvironment]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.2.3.RELEASE)

2015-04-17 20:13:51.209  INFO 20510 --- [           main] o.a.maven.surefire.booter.ForkedBooter   : Starting ForkedBooter v2.17 on VolkersMBP2013-2.local with PID 20510 (/Users/volkerreichel/.m2/repository/org/apache/maven/surefire/surefire-booter/2.17/surefire-booter-2.17.jar started by volkerreichel in /Users/volkerreichel/Projects/GitHub/Kontaktliste)
2015-04-17 20:13:51.358  INFO 20510 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Refreshing org.springframework.web.context.support.GenericWebApplicationContext@49b0b76: startup date [Fri Apr 17 20:13:51 CEST 2015]; root of context hierarchy
2015-04-17 20:13:53.051  INFO 20510 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'beanNameViewResolver': replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter; factoryMethodName=beanNameViewResolver; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter.class]]
2015-04-17 20:13:56.678  INFO 20510 --- [           main] o.s.b.f.config.PropertiesFactoryBean     : Loading properties file from class path resource [rest-default-messages.properties]
2015-04-17 20:13:59.116  INFO 20510 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.web.context.support.GenericWebApplicationContext@49b0b76: startup date [Fri Apr 17 20:13:51 CEST 2015]; root of context hierarchy
2015-04-17 20:13:59.281  INFO 20510 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],methods=[],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2015-04-17 20:13:59.283  INFO 20510 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],methods=[],params=[],headers=[],consumes=[],produces=[text/html],custom=[]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest)
2015-04-17 20:13:59.364  INFO 20510 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2015-04-17 20:13:59.365  INFO 20510 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2015-04-17 20:13:59.459  INFO 20510 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2015-04-17 20:14:00.364  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health],methods=[],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(java.security.Principal)
2015-04-17 20:14:00.366  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.368  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
2015-04-17 20:14:00.369  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.371  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
2015-04-17 20:14:00.372  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.374  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.375  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.376  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.377  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.379  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/shutdown],methods=[POST],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.ShutdownMvcEndpoint.invoke()
2015-04-17 20:14:00.380  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.381  INFO 20510 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
2015-04-17 20:14:00.650  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerAdapter   : Looking for @ControllerAdvice: org.springframework.web.context.support.GenericWebApplicationContext@49b0b76: startup date [Fri Apr 17 20:13:51 CEST 2015]; root of context hierarchy
2015-04-17 20:14:00.713  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception
2015-04-17 20:14:00.714  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}/{propertyId}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception
2015-04-17 20:14:00.715  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[DELETE],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.deletePropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String) throws java.lang.Exception
2015-04-17 20:14:00.717  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[GET],params=[],headers=[],consumes=[],produces=[application/x-spring-data-compact+json || text/uri-list],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReferenceCompact(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception
2015-04-17 20:14:00.719  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[PATCH || PUT],params=[],headers=[],consumes=[application/json || application/x-spring-data-compact+json || text/uri-list],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.createPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.http.HttpMethod,org.springframework.hateoas.Resources<java.lang.Object>,java.io.Serializable,java.lang.String) throws java.lang.Exception
2015-04-17 20:14:00.720  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}/{propertyId}],methods=[DELETE],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.deletePropertyReferenceId(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,java.lang.String) throws java.lang.Exception
2015-04-17 20:14:00.724  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/schema],methods=[GET],params=[],headers=[],consumes=[],produces=[application/schema+json],custom=[]}" onto public org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.json.JsonSchema> org.springframework.data.rest.webmvc.RepositorySchemaController.schema(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.730  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[OPTIONS],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.optionsForCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.731  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[HEAD],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.headCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation) throws org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.732  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.hateoas.Resources<?> org.springframework.data.rest.webmvc.RepositoryEntityController.getCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.734  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[GET],params=[],headers=[],consumes=[],produces=[application/x-spring-data-compact+json || text/uri-list],custom=[]}" onto public org.springframework.hateoas.Resources<?> org.springframework.data.rest.webmvc.RepositoryEntityController.getCollectionResourceCompact(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.735  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[POST],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.postCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.736  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[OPTIONS],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.optionsForItemResource(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.737  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[HEAD],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.headForItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable) throws org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.738  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource<?>> org.springframework.data.rest.webmvc.RepositoryEntityController.getItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.739  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[PUT],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.putItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.740  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[PATCH],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.patchItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.web.HttpRequestMethodNotSupportedException,org.springframework.data.rest.webmvc.ResourceNotFoundException
2015-04-17 20:14:00.741  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[DELETE],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.deleteItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException
2015-04-17 20:14:00.744  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/],methods=[OPTIONS],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.RepositoryController.optionsForRepositories()
2015-04-17 20:14:00.745  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/],methods=[HEAD],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryController.headForRepositories()
2015-04-17 20:14:00.746  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.RepositoryLinksResource> org.springframework.data.rest.webmvc.RepositoryController.listRepositories()
2015-04-17 20:14:00.750  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search],methods=[HEAD],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.RepositorySearchController.headForSearches(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.751  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.hateoas.ResourceSupport org.springframework.data.rest.webmvc.RepositorySearchController.listSearches(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.752  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search],methods=[OPTIONS],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.RepositorySearchController.optionsForSearches(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.754  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<java.lang.Object> org.springframework.data.rest.webmvc.RepositorySearchController.executeSearch(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.web.context.request.WebRequest,java.lang.String,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler)
2015-04-17 20:14:00.756  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[GET],params=[],headers=[],consumes=[],produces=[application/x-spring-data-compact+json],custom=[]}" onto public org.springframework.hateoas.ResourceSupport org.springframework.data.rest.webmvc.RepositorySearchController.executeSearchCompact(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.web.context.request.WebRequest,java.lang.String,java.lang.String,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler)
2015-04-17 20:14:00.757  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[OPTIONS],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<java.lang.Object> org.springframework.data.rest.webmvc.RepositorySearchController.optionsForSearch(org.springframework.data.rest.webmvc.RootResourceInformation,java.lang.String)
2015-04-17 20:14:00.758  INFO 20510 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[HEAD],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<java.lang.Object> org.springframework.data.rest.webmvc.RepositorySearchController.headForSearch(org.springframework.data.rest.webmvc.RootResourceInformation,java.lang.String)
2015-04-17 20:14:00.830  INFO 20510 --- [           main] o.s.d.r.w.BaseUriAwareHandlerMapping     : Mapped "{[/alps],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto org.springframework.http.HttpEntity<org.springframework.hateoas.alps.Alps> org.springframework.data.rest.webmvc.alps.AlpsController.alps()
2015-04-17 20:14:00.832  INFO 20510 --- [           main] o.s.d.r.w.BaseUriAwareHandlerMapping     : Mapped "{[/alps || /alps/{repository}],methods=[OPTIONS],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.alps.AlpsController.alpsOptions()
2015-04-17 20:14:00.833  INFO 20510 --- [           main] o.s.d.r.w.BaseUriAwareHandlerMapping     : Mapped "{[/alps/{repository}],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.RootResourceInformation> org.springframework.data.rest.webmvc.alps.AlpsController.descriptor(org.springframework.data.rest.webmvc.RootResourceInformation)
2015-04-17 20:14:00.981  INFO 20510 --- [           main] o.a.maven.surefire.booter.ForkedBooter   : Started ForkedBooter in 10.345 seconds (JVM running for 12.015)
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 11.462 sec - in de.vrsoft.springboot.demo.kontaktliste.KontaktlisteApplicationTests
2015-04-17 20:14:01.053  INFO 20510 --- [       Thread-1] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@49b0b76: startup date [Fri Apr 17 20:13:51 CEST 2015]; root of context hierarchy

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ demo ---
[INFO] Building jar: /Users/volkerreichel/Projects/GitHub/Kontaktliste/target/demo-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.3.RELEASE:repackage (default) @ demo ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 18.587 s
[INFO] Finished at: 2015-04-17T20:14:03+01:00
[INFO] Final Memory: 16M/309M
[INFO] ------------------------------------------------------------------------

</pre>

