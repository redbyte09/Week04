package com.smartmanagmentsyastem;

import java.util.List;
import java.util.ArrayList;

public class Storage <T extends WarehouseItem>{
    private List<T> items;
    public Storage() {
        items=new ArrayList<T>();
    }

    public void addItem(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }

    public void displayAllItem(List<? extends WarehouseItem>itemList){
        for(WarehouseItem item : itemList){
            item.display();
        }
    }

}
