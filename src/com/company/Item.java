package com.company;

import java.util.Objects;

public abstract class Item implements Comparable<Object>, PriceCalculator {
    private double unitPrice;
    private int availableQuantity;

    public Item(double unitPrice, int availableQuantity){
        this.unitPrice = unitPrice;
        this.availableQuantity = availableQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.unitPrice, unitPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitPrice, availableQuantity);
    }

    @Override
    public int compareTo(Object o) {
        Item b = (Item) o;
        if(this.availableQuantity < b.availableQuantity)
            return -1;
        if(this.availableQuantity > b.availableQuantity)
            return 1;
        return 0;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = availableQuantity * calculatePrice();
        return totalPrice;
    }
}
