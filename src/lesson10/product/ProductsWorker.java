package lesson10.product;

import lesson10.Constants;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ProductsWorker {
    private final Scanner scanner = new Scanner(System.in);
    public byte[] addProduct(){
        Product product = new Product();
        product.setIdProduct(Constants.randomId());
        System.out.println(Constants.ENTER_PRODUCT_NAME);
        product.setNameProduct(scanner.next());
        product.setProductionData(Constants.randomData());
        return product.toString().getBytes(StandardCharsets.UTF_8);
    }
}

