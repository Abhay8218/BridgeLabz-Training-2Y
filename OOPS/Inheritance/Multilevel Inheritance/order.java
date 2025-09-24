// Base class
class order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order " + orderId + " placed on " + orderDate;
    }
}

// Subclass of Order
class ShippedOrder extends order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " shipped. Tracking Number: " + trackingNumber;
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order " + orderId + " delivered on " + deliveryDate;
    }
}

// Test class
public class OnlineRetailDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD101", "2025-09-20");
        ShippedOrder shipped = new ShippedOrder("ORD101", "2025-09-20", "TRK56789");
        DeliveredOrder delivered = new DeliveredOrder("ORD101", "2025-09-20", "TRK56789", "2025-09-23");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
