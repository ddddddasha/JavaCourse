package lesson10.order;

import lesson10.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idOrder;
    public List<Product> productList = new ArrayList<>();
    private String orderData;

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    @Override
    public String toString() {
        return "Order:" +
                "idOrder:" + idOrder +
                ", productList:" + productList +
                ", orderData:" + orderData;
    }
}
