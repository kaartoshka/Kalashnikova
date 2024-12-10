import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean sellProduct(String productName, int quantity, Customer customer) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                if (product.removeQuantity(quantity)) {
                    System.out.println("Sold " + quantity + " of " + productName + " to " + customer.getName());
                    return true;
                } else {
                    System.out.println("Not enough stock for " + productName);
                    return false;
                }
            }
        }
        System.out.println("Product not found");
        return false;
    }

    public List<Product> getAvailableProducts() {
        return products;
    }

    public Map<String, Integer> groupProductsByType() {
        Map<String, Integer> groupedProducts = new HashMap<>();
        for (Product product : products) {
            groupedProducts.put(product.getName(), product.getQuantity());
        }
        return groupedProducts;
    }
}
