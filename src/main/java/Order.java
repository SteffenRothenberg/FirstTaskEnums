public class Order {

        private String id;
        private OrderStatus orderStatus;


        public Order(String id, OrderStatus orderStatus) {
                this.id = id;
                this.orderStatus = orderStatus;
        }

        public OrderStatus getOrderStatus() {
                return orderStatus;
        }

        public void setOrderStatus(OrderStatus orderStatus) {
                this.orderStatus = orderStatus;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }
}
