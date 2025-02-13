package BeyondJava8Feature2;

public class Q1Q2Q3 {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Avi", 11);
        Student st2 = new Student(2, "Abhinav", 12);
        Student st3 = new Student(1, "Avi", 11);

        System.out.println(st1.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st1 == st3);
    }
}
