//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.19 à 05:37:21 PM WAT 
//


package de.tekup.soap.models.whitetest;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.tekup.soap.models.whitetest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.tekup.soap.models.whitetest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentRequest }
     * 
     */
    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }

    /**
     * Create an instance of {@link WhiteTestResponse }
     * 
     */
    public WhiteTestResponse createWhiteTestResponse() {
        return new WhiteTestResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Exam }
     * 
     */
    public Exam createExam() {
        return new Exam();
    }

}
