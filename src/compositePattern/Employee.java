package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{
    private List<Person> subPersons = new ArrayList<>();

    public List<Person> getSubPersons() {
        return subPersons;
    }

    public void setSubPersons(List<Person> subPersons) {
        this.subPersons = subPersons;
    }

    public Employee(int id, String name) {
        super(id, name);
    }
    public void addSubPerson(Person person){
        subPersons.add(person);
    }

    public void removeSubPerson(Person person){
        subPersons.remove(person);
    }
}
