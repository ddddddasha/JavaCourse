package lesson10.order;

import lesson10.Constants;
import lesson10.product.Product;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OrderWorker {
    private final Scanner scanner = new Scanner(System.in);
    private final Order order = new Order();

    public byte[] addOrder(){
        System.out.println(Constants.NUMBER_PRODUCTS);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(Constants.ENTER_PRODUCT_DATA);
            order.setIdOrder(Constants.randomId());
            Product product = new Product();
            product.setIdProduct(scanner.nextInt());
            product.setNameProduct(scanner.next());
            product.setProductionData(scanner.next());
            order.productList.add(product);
            order.setOrderData(Constants.randomData());
        }
        return order.toString().getBytes(StandardCharsets.UTF_8);
    }
}
