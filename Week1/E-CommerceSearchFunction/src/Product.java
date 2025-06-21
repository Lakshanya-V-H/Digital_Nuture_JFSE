public class Product {
    int productId;
    String productName;
    String category;
    Double price;

    public Product(int productId, String productName, String category , Double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }
    @Override
    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + ", "+price+ "]";
    }
}
