package Collections;

import java.util.Objects;

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
