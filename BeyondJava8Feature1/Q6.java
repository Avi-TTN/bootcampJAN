package BeyondJava8Feature1;


public class Q6 {
    public static void main(String[] args) {
        System.out.println(Restaurant.processOrderStatus(Restaurant.OrderStatus.PROCESSING));
        System.out.println(Restaurant.processOrderStatus(Restaurant.OrderStatus.PENDING));
        System.out.println(Restaurant.processOrderStatus(Restaurant.OrderStatus.REFUNDED));

    }
}
