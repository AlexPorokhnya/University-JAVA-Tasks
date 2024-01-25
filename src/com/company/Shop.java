package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    List<Item> products = new ArrayList<Item>();

    public void addItem(Item addableItem){
        products.add(addableItem);
    }

    public void sortByUnitPrice(){
        List<Item> itemList = new ArrayList<>();
        itemList.sort(Comparator.comparing(Item::getUnitPrice));
    }

    public void sortByAvailableQuantity(){
        List<Item> itemList = new ArrayList<>();
        itemList.sort(Comparator.comparing(Item::getAvailableQuantity));
    }

    public double AvrTotalPrice(){
        double avgTotalPrice = 0;
        for(Item item : products){
            avgTotalPrice += item.calculateTotalPrice();
        }
        return avgTotalPrice;
    }

    public Item getItemWithHighestCalculatedPrice(){
        Item buffer = products.get(0);
        for(Item item : products){
            if(item.equals(buffer))
                buffer = item;
        }
        return buffer;
    }

    public String DisplayItems(){
        StringBuilder str = new StringBuilder();
        for(Item item : products){
            str = str.append(item.toString()).append("\n");
        }
        return str.toString();
    }
}
