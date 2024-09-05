package org.leorodriguez.introtojavabasics;

public class FoodDriver {
    public static void main(String[] args) {
        //Create FastFood object:
        FastFood fastFood = new FastFood();
        fastFood.checkNumberOfCalories();
        fastFood.setFoodGroup(Food.FoodGroup.DIARY);
        fastFood.setColor("White");
        fastFood.setCooked(true);
        fastFood.setName("Milkshake");
        fastFood.setEdible(true);
        fastFood.setNumberOfNutrients(2);
        fastFood.setOrganic(false);
        fastFood.setNumberOfNutrients(3);
        String[] nutrientsOfMilk = {"Vitamins","Proteins","Fat"};
        fastFood.setNutrients(nutrientsOfMilk);
        fastFood.setSmell(Food.Smell.FRUITY);
        fastFood.setTaste(Food.Taste.SWEET);
        fastFood.setTemperature(5);
        System.out.println(fastFood.eat());
    }
}