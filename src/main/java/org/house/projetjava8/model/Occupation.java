package org.house.projetjava8.model;
import java.time.LocalDate;
public class Occupation {
    private int id;
    private int personId;
    private int bedId;
    private String startDate;
    private String endDate;

    public Occupation(int id, int personId, int bedId, String startDate, String endDate, boolean exited) {
        this.id = id;
        this.personId = personId;
        this.bedId = bedId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.exited = exited;
    }
}
