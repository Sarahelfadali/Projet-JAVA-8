package org.house.projetjava8.dao;

import org.house.projetjava8.model.Person;
import java.util.List;

public interface PersonDAO {
    Person findById(int id);
    List<Person> findAll();
    void save(Person person);
    void update(Person person);
    void delete(int id);
}
