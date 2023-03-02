package lesson10.product;

public class Product {
    private int idProduct;
    private String nameProduct;
    private String productionData;

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setProductionData(String productionData) {
        this.productionData = productionData;
    }

    @Override
    public String toString() {
        return "Product: " +
                "idProduct: " + idProduct +
                ", nameProduct: " + nameProduct +
                ", productionData: " + productionData;
    }
}
