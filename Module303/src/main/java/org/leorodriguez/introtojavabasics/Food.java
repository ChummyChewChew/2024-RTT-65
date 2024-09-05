package org.leorodriguez.introtojavabasics;
/*
Super/Parent/BASE Class:
This class will be common to all foods:
. Nutrients
. Smell
. Taste
. Edible? ********
. Temperature
. Names
. Food Group
. Cooked/Raw
. Color
 */
public class Food {

    enum Smell{
        FLORAL,
        FRUITY,
        SPICY,
        MUSKY,
        EARTHY,
        WOODY
    }
    enum Taste{
        BITTER,
        SOUR,
        SWEET,
        SALTY,
        SPICY
    }
    enum FoodGroup{
        FRUITS,
        VEGETABLES,
        GRAINS,
        PROTEIN,
        DIARY
    }
    //Attributes, class variables, features:
    private String[] nutrients;
    private int numberOfNutrients;
    private int calories;
    private String color;
    private String name;
    private boolean cooked;
    private Taste taste;
    private Smell smell;
    private boolean edible;
    private double temperature;
    private FoodGroup foodGroup;
    private  boolean organic;

    //Constructors:
    public Food(){

    }

    public Food(String[] nutrients, int numberOfNutrients, int calories,
                String color, String name, boolean cooked, Taste taste,
                Smell smell, boolean edible, double temperature, FoodGroup
                        foodGroup, boolean organic){
        this.nutrients=nutrients;
        this.numberOfNutrients=numberOfNutrients;
        this.calories=calories;
        this.color=color;
        this.name=name;
        this.cooked=cooked;
        this.taste=taste;
        this.smell=smell;
        this.edible=edible;
        this.temperature=temperature;
        this.foodGroup=foodGroup;
        this.organic=organic;
    }

    //Setters (Mutator methods)
    public void setNutrients(String[] nutrients){
        this.nutrients=nutrients;
    }
    public void setNumberOfNutrients(int numberOfNutrients){
        this.numberOfNutrients=numberOfNutrients;
    }
    public void setCalories(int calories){
        this.calories=calories;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCooked(boolean cooked){
        this.cooked=cooked;
    }
    public void setTaste(Taste taste){
        this.taste=taste;
    }
    public void setSmell(Smell smell){
        this.smell=smell;
    }
    public void setEdible(boolean edible){
        this.edible=edible;
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
    public void setFoodGroup(FoodGroup foodGroup){
        this.foodGroup=foodGroup;
    }
    public void setOrganic(boolean organic){
        this.organic=organic;
    }

    //Getters: Accessor methods:
    public String[] getNutrients(){
        return nutrients;
    }
    public int getNumberOfNutrients(){
        return numberOfNutrients;
    }
    public int getCalories(){
        return calories;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public boolean isCooked(){
        return cooked;
    }
    public Taste getTaste(){
        return taste;
    }
    public Smell getSmell(){
        return smell;
    }
    public boolean isEdible(){
        return edible;
    }
    public double getTemperature(){
        return temperature;
    }
    public FoodGroup getFoodGroup(){
        return foodGroup;
    }
    public boolean isOrganic(){
        return organic;
    }

    public String eat(){
        String canEat="";
        if (edible){ //if (edible==true)
            canEat="You can eat "+name;
        } else
            canEat="You can't eat "+name;
        return canEat;
    }
}