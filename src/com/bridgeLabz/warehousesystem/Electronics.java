package src.com.bridgeLabz.warehousesystem;



public class Electronics extends WarehouseItem {
    private String name;
    private int quantity;

    Electronics(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void showDetails(){
        System.out.println("Name: "+name+"\nQuantity: "+quantity);
    }
}
