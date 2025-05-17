package org.house.projetjava8.model;
import java.time.LocalDate;
import java.util.List;


public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String gender;
    private String birthDate;
    private String birthCity;
    private String socialSecurityNumber;
    private List<String> knownAddresses;

    

    public Person(int id, String lastName, String firstName, String gender, String birthDate,
                  String birthCity, String socialSecurityNumber, List<String> knownAddresses) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.socialSecurityNumber = socialSecurityNumber;
        this.knownAddresses = knownAddresses;
    }

    

}
