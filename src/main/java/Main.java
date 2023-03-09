public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("firstOrderOfTheDay", OrderStatus.RECEIVED);
        Order order2 = new Order("secondOrderOfTheDay", OrderStatus.CANCELLED);
        Order order3 = new Order("thirdOrderOfTheDay", OrderStatus.IN_DELIVERY);
        System.out.println(order1.getOrderStatus());
        System.out.println(order1.getId());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());

        switch (order1.getOrderStatus()) {
            case RECEIVED -> System.out.println(OrderStatus.RECEIVED.getOrderStatus());
            case IN_PROGRESS -> System.out.println(OrderStatus.IN_PROGRESS.getOrderStatus());
            case IN_DELIVERY -> System.out.println(OrderStatus.IN_DELIVERY.getOrderStatus());
            case COMPLETED -> System.out.println(OrderStatus.COMPLETED.getOrderStatus());
            case CANCELLED -> System.out.println(OrderStatus.CANCELLED.getOrderStatus());
            default -> System.out.println("Status unknown, please contact Support!");
        }
    }
}