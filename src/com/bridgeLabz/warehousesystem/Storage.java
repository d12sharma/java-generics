package src.com.bridgeLabz.warehousesystem;



import java.util.*;
public class Storage<T extends WarehouseItem>{
    List <T> ls = new ArrayList<>();

    void addItem(T item){
        ls.add(item);
    }

    void displayAll(){
        for(T item : ls){
            item.showDetails();
        }
    }
}
