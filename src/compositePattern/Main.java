package compositePattern;

public class Main {
    public static void main(String[] args) {
        //gruptaki çalışanlar ve o çalışanların hiyerarşisi

        Employee employee1 = new Employee(1,"Burcu");
        Employee employee2 = new Employee(2,"Duygu");
        Employee employee3 = new Employee(3,"Sare");
        Employee employee4 =  new Employee(4, "jghgh");
        employee1.addSubPerson(employee4);

        employee1.addSubPerson(employee2);
        employee2.addSubPerson(employee3);

        for (Person manager:employee1.getSubPersons()) {
            System.out.println(manager.getName());
            for (Person employee: employee2.getSubPersons()){
                System.out.println(employee.getName());
            }

        }

    }
}
