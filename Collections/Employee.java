package Collections;

import java.util.Comparator;

class Employee implements Comparable<Employee>{
    Double age;
    Double salary;
    String name;

    Employee(String name, Double age, Double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.salary > o2.salary) return 1;
            else if(o1.salary < o2.salary) return -1;
            else return 0;
        }
    };

    @Override
    public String toString() {
        return String.format("Employee Name: %s | Age: %f | Salary: $ %f", name, age, salary);
    }

    @Override
    public int compareTo(Employee o) {
        String[] arr1 = this.name.split(" ");
        String[] arr2 = o.name.split(" ");
        String firstName1 = arr1[0];
        String lastName1 = arr1[1];
        String firstName2 = arr2[0];
        String lastName2 = arr2[1];
        if(firstName1.compareTo(firstName2) == 0) return lastName1.compareTo(lastName2);
        return firstName1.compareTo(firstName2);
    }
}
