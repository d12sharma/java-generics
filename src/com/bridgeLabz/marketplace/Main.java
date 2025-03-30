package src.com.bridgeLabz.marketplace;



public class Main {
    public static void main(String[] args) {

        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetCategory gadgetCategory = new GadgetCategory();


        Product<BookCategory> book = new Product<>("The Fault In Our Stars", 650.0, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 930.0, clothingCategory);
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 50000.0, gadgetCategory);


        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(smartphone);


        System.out.println("Before Discount:");
        catalog.showProducts();


        ProductCatalog.applyDiscount(book, 10);
        ProductCatalog.applyDiscount(smartphone, 15);


        System.out.println("\nAfter Discount:");
        catalog.showProducts();
    }
}
