package org.leorodriguez.introtojavabasics;

//Sub/child/derived class of food class:
// Microwavable, Frozen, GMO, EthnicFood

import java.util.Scanner;

public class FastFood extends Food {
    Scanner scanner = new Scanner(System.in);

   /* public FastFood(String[] nutrients, int numberOfNutrients, int calories,
                    String color, String name, boolean cooked, Taste taste,
                    Smell smell, boolean edible, double temperature, FoodGroup
                            foodGroup, boolean organic) {
        super(nutrients,numberOfNutrients,calories,color,name,cooked,taste,smell,
        edible,temperature,foodGroup,organic);
    }*/

    public FastFood() {

    }

    public void checkNumberOfCalories() {
        // what is a proper number of nutrients for fast food <100:
        int numOfCalories;
        do{
            System.out.println("Please enter the number of calories");
            numOfCalories=scanner.nextInt();
        } while (numOfCalories < 100);
        setCalories(numOfCalories);
    }

    //override eat() method:
    @Override
    public String eat(){
        String canEat="";
        if (isEdible()){ //if (edible==true)
            canEat="You can eat "+getName() +"\n You have had fast food this week "
                    +"so no more fast food for you!";
        } else
            canEat="You can't eat "+getName();
        return canEat;
    }


}