package org.house.projetjava8.model;
import java.util.List;

public class Room {
    private int id;
    private String name;
    private String genderRestriction;
    private Integer minAge;
    private Integer maxAge;
    private List<Bed> beds;

    public Room(int id, String name, String genderRestriction, Integer minAge, Integer maxAge, List<Bed> beds) {
        this.id = id;
        this.name = name;
        this.genderRestriction = genderRestriction;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.beds = beds;
    }

}
