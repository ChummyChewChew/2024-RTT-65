package org.leorodriguez.introtojavabasics;

public class PizzaDriver {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", 1, 1, 1);
        Pizza pizza2 = new Pizza("Medium", 2, 2, 2);
        Pizza pizza3 = new Pizza("Small", 3, 3, 3);
        System.out.println(pizza1.getDescription());

        PizzaOrder pizzaOrder1 = new PizzaOrder();
        pizzaOrder1.addPizza(pizza1);
        pizzaOrder1.addPizza(pizza2);
        pizzaOrder1.addPizza(pizza3);
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
        System.out.println(pizzaOrder1.orderTotal());


    }
}
