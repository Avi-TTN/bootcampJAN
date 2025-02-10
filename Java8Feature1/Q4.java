package Java8Feature1;

public class Q4 {
    public static void main(String[] args) {
        Recruiter recruit = Newer::new;
        Newer emp1 =  recruit.appointed(21,"John");
        Newer emp2 = recruit.appointed(22, "Dave");
        emp1.getDetails();
        emp2.getDetails();
    }
}
