package com.company;

public class Main {

    public static void main(String[] args) {
	    Shop shop = new Shop();
	    Item meat = new FoodItem(120, 10, FoodType.MEAT, 20);
	    Item eggs = new FoodItem(100, 30, FoodType.DAIRY, 30);
	    Item blackBread = new FoodItem(20, 60, FoodType.BREAD, 10);
	    Item other = new FoodItem(150, 20, FoodType.OTHER, 23);
	    Item beer = new DrinkItem(50, 40, DrinkType.ALCOHOLIC);
	    Item coda = new DrinkItem(35, 50, DrinkType.NON_ALCOHOLIC);
	    Item cola = new DrinkItem(15, 30, DrinkType.NON_ALCOHOLIC);
	    Item whisky = new DrinkItem(45, 14, DrinkType.ALCOHOLIC);
	    shop.addItem(meat);
        shop.addItem(eggs);
        shop.addItem(blackBread);
        shop.addItem(other);
        shop.addItem(beer);
        shop.addItem(coda);
        shop.addItem(cola);
        shop.addItem(whisky);

        System.out.println(shop.DisplayItems());
    }
}
