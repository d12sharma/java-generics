package src.com.bridgeLabz.warehousesystem;



public class Furniture extends WarehouseItem{
    private String name;
    private int warranty;

    Furniture(String name, int warranty){
        this.name = name;
        this.warranty = warranty;
    }

    public void showDetails(){
        System.out.println("Name: "+name+"\nWarranty: "+warranty);
    }
}