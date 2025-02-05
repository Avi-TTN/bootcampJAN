package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static Collections.Employee.salaryComparator;

public class Q2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 21.0, 12345.2));
        employees.add(new Employee("Hiroshi Tanaka", 23.0, 32545.1));
        employees.add(new Employee("Luca Romana", 24.0, 59413.5));
        employees.add(new Employee("Santiago Gracia", 32.0, 156513.2));
        employees.add(new Employee("Aleksandr Ivanov", 31.0, 51676.9));
        System.out.println("\n/////////////////Unsorted List/////////////");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println("\n///////////////Sorted List using Comparable (based on First and Last Name)/////////////");
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println("\n///////////////Sorted List using Compartor (based on Salary)/////////////");
        Collections.sort(employees, salaryComparator);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}



