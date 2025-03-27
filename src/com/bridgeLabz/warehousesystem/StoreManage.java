package src.com.bridgeLabz.warehousesystem;



public class StoreManage {
    public static void main(String[] args) {
        Electronics e1 = new Electronics("Air Purifier", 20);
        Electronics e2 = new Electronics("Heater", 35);

        Furniture f1 = new Furniture("Sofa", 2);
        Furniture f2 = new Furniture("Bed", 4);

        Groceries g1 = new Groceries("Onion", 20, 2025);
        Groceries g2 = new Groceries("Paneer", 13, 2025);

        Storage<WarehouseItem> s1 = new Storage<>();
        s1.addItem(e1);
        s1.addItem(e2);

        s1.addItem(g1);
        s1.addItem(g2);

        s1.addItem(f1);
        s1.addItem(f2);

        s1.displayAll();

    }
}
