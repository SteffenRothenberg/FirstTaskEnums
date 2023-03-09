public enum OrderStatus {

    RECEIVED("Received"),
    IN_PROGRESS("In "),
    IN_DELIVERY("I Delivery"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

    private String orderStatus;

    OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
