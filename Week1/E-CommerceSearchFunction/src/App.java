import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        Product[] products = {
            new Product(101, "Laptop", "Electronics",50000.00),
            new Product(102, "Shoes", "Fashion",1200.00),
            new Product(103, "Phone", "Electronics",25000.00),
            new Product(104, "Watch", "Accessories",3000.00),
            new Product(104, "Ring", "Accessories",3500.00)
        };

        System.out.println("Linear Search:");
        ProductSearch ps = new ProductSearch();
        Product result1 = ps.linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found.");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        System.out.println("Binary Search:");
        Product result2 = ps.binarySearch(products, "Ring");
        System.out.println(result2 != null ? result2 : "Product not found.");
    }
}
