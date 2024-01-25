package com.company;

public class DrinkItem extends Item{
    DrinkType drinkType;

    public DrinkItem(double unitPrice, int availableQuantity, DrinkType drinkType){
        super(unitPrice, availableQuantity);
        this.drinkType = drinkType;
    }

    @Override
    public double calculatePrice() {
        double price = getUnitPrice();
        switch (drinkType){
            case ALCOHOLIC:
                price += getUnitPrice() * 0.15;
                return price;
            case NON_ALCOHOLIC:
                price += getUnitPrice() + 0.1;
                return price;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "DrinkItem{" +
                "drinkType=" + drinkType +
                '}';
    }
}
