# Kontaktliste
Verwaltung von Kontakten mittels Spring Boot und MongoDB

##Vorgehen
1. Erstellen des Grundgrüsts für des Projekt mittels http://start.spring.io/.
![alt text](spring_boot_initialzr.tiff "Spring Boot Initializr")

1.1 Mit dieser Webseite läßt sich ein Projektgrundgerüst bestehend aus Verzeichnisstruktur, zu verwendende Module (Spring Komponenten, Datenbanksysteme, Template-Engines, pom.xml etc.) auswählen und zu einer Zip-Datei zusammenpacken.
Dieses Zip-Archiv kann dann in einem beliebigen Verzeichnis entpackt und in eine IDE importiert werden.

1.2 Zip-Archiv erstellen
![alt text](spring_boot_initialzr_generate_project_button.tiff "Projekt erstellen")
[demo.zip](demo.zip).

1.3 In Eclipse über "Import Existing Maven Project" das Projekt importieren
![alt text](eclips_import_maven_project.tiff "Maven Projekt importieren")

1.4 Zip-Archiv herunterladen und den Inhalt des demo-Verzeichnisses auspacken.
![alt text](eclipse_project_layout.tiff "Verzeichnisstruktur")

##Die Maven-Projekt-Datei:

```xml
<?xml version="1.0" encoding="UTF-8"?>
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


