package Java8Feature2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        List<Employee> ls = new ArrayList<>();
        Employee emp1 = new Employee("Bhanu Pratap Singh", 3000L , "Bhiwadi");
        Employee emp2 = new Employee("Amit Pratap Singh", 5000L , "Delhi");
        Employee emp3 = new Employee("Mukul Yadav", 0L , "Rewari");
        Employee emp4 = new Employee("Sarthak Jindal", 2000L , "Shadabad");
        Employee emp5 = new Employee("Abhinav Dwivedi", 4000L , "Delhi");
        Employee emp6 = new Employee("Amit Sharma", 4000L , "Delhi");
        ls.add(emp1);
        ls.add(emp2);
        ls.add(emp3);
        ls.add(emp4);
        ls.add(emp5);
        ls.add(emp6);
        List <String> filteredList = ls.stream()
                .filter(x -> x.salary < 5000)
                .filter(x -> x.city.equals("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
