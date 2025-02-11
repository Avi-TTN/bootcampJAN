package Java8Feature2;

public class Employee {

    String fullName;
    Long salary;
    String city;

    Employee(String fullName, Long salary, String city){
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    String getFirstName(){
        String[] name = fullName.split(" ");
        return name[0];
    }

    @Override
    public String toString() {
        return fullName + " | " + salary + " | " + city;
    }
}
