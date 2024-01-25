package com.company;

public class FoodItem extends Item{
    FoodType foodType;
    int daysToExpire;

    public FoodItem(double unitPrice, int availableQuantity, FoodType foodType, int daysToExpire){
        super(unitPrice, availableQuantity);
        this.foodType = foodType;
        this.daysToExpire = daysToExpire;
    }

    @Override
    public double calculatePrice() {
        double price = getUnitPrice();
        switch (foodType){
            case BREAD:
                price += getUnitPrice() * 0.05;
                return price;
            case DAIRY:
                price += getUnitPrice() * 0.03;
                return price;
            case MEAT:
                price += getUnitPrice() * 0.1;
                return price;
            case OTHER:
                price += getUnitPrice() * 0.07;
        }
        if(daysToExpire < 15){
            price += getUnitPrice() * 0.06;
        }
        return price;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodType=" + foodType +
                ", daysToExpire=" + daysToExpire +
                '}';
    }
}
