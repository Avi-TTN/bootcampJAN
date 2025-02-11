package Java8Feature2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter date 1 : ");
        String d1 = sc.next();
        System.out.print("Enter date 2 : ");
        String d2 = sc.next();
        LocalDate date1 = LocalDate.parse(d1,myFormat);
        LocalDate date2 = LocalDate.parse(d2,myFormat);
        if(date1.isAfter(date2)){
            System.out.println("Date 1 Occurs After Date 2");
        }
        else{
            System.out.println("Date 1 Occurs Before Date 2");
        }
    }
}
