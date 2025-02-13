package BeyondJava8Feature2;

public class Q1Q2Q3 {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Avi", 11);
        Student st2 = new Student(2, "Abhinav", 12);
        Student st3 = new Student(1, "Avi", 11);

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
    }
}
