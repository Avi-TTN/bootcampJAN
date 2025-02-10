package Java8Feature1;

public class Q2 {
    public static void main(String[] args) {
        OperationTypes obj = new OperationTypes();
        Operations addition = obj::add;
        Operations substraction = obj::subtract;
        Operations multiplication = OperationTypes::multiply;
        System.out.println(addition.calculate(5,4));
        System.out.println(substraction.calculate(5,4));
        System.out.println(multiplication.calculate(5,4));
    }
}
