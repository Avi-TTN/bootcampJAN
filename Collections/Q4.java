package Collections;

import java.util.HashMap;
import java.util.Objects;

public class Q4 {
    public static void main(String[] args) {
        Employeee emp1 = new Employeee("Avi", 21, "SDE Trainee");
        Employeee emp2 = new Employeee("Abhinav", 21, "SDE Trainee");
        Employeee emp3 = new Employeee("John", 21, "ABC");
        HashMap<Employeee, Integer> map = new HashMap<Employeee, Integer>();
        map.put(emp1, 15000);
        map.put(emp2, 15000);
        map.put(emp3, 20000);
        for(Employeee emp : map.keySet()){
            System.out.println("Name : " + emp.name + " | salary ->  " +map.get(emp));
        }
    }
}
class Employeee {
    String name;
    int age;
    String designation;
    Employeee(String name, int age, String designation){
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,designation);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Employeee emp = (Employeee) obj;
        return age == emp.age && Objects.equals(name, emp.name) && Objects.equals(designation, emp.designation);
    }
}