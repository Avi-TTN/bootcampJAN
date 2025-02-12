package BeyondJava8Feature1;

public class Restaurant {
    enum OrderStatus{
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }
    public static String processOrderStatus(OrderStatus status){
        String str = switch (status){
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED -> {
                String refundMessage = "Refund has been issued for the order.";
                yield refundMessage;
            }
            case PENDING -> "Order is still pending.";
        };
        return str;
    }
}
