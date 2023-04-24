package code;

public class orderSingle {
    private static orderSingle instance = null;
    private Order order;

    private orderSingle() {
        order = new Order();
    }

    public static orderSingle getInstance() {
        if (instance == null) {
            instance = new orderSingle();
        }
        return instance;
    }

    public Order getOrder() {
        return order;
    }

}

