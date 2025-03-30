package src.com.bridgeLabz.marketplace;



import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<?>> productList = new ArrayList<>();

    public void addProduct(Product<?> product) {
        productList.add(product);
    }

    public void showProducts() {
        for (Product<?> product : productList) {
            System.out.println(product);
        }
    }

    // Generic Method to Apply Discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
        System.out.println("Discount applied! New Price of " + product.getName() + ": Rs." + newPrice);
    }
}
