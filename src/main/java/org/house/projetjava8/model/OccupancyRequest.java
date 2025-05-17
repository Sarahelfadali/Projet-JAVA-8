package org.house.projetjava8.model;
import java.time.LocalDate;
import java.util.List;

public class OccupancyRequest {
    private String minDate;
    private String maxDate;
    private int numberOfPeople;
    private boolean sameRoomRequired;
    private List<PersonCriteria> personCriteriaList;

    public static class PersonCriteria {
        private int age;
        private String gender;

        public PersonCriteria(int age, String gender) {
            this.age = age;
            this.gender = gender;
        }
    }


    public OccupancyRequest(String minDate, String maxDate, int numberOfPeople,
                            boolean sameRoomRequired, List<PersonCriteria> personCriteriaList) {
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.numberOfPeople = numberOfPeople;
        this.sameRoomRequired = sameRoomRequired;
        this.personCriteriaList = personCriteriaList;
    }

}
