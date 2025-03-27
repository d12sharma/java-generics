package src.com.bridgeLabz.warehousesystem;



public class Groceries extends WarehouseItem{
    private String name;
    private int quantity;
    private int expiryYear;

    Groceries(String name, int quantity, int expiryYear){
        this.name = name;
        this.quantity = quantity;
        this.expiryYear = expiryYear;
    }

    public void showDetails(){
        System.out.println("Name: "+name+"\nQuantity: "+quantity+"\nExpiry Year: "+expiryYear);
    }
}
