package org.leorodriguez.introtojavabasics;

public class Pizza {
    //Initializing elements
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    //Constructor
    Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }//Getters and setters

    public String getSize() {
        return size;
    }

    public int getCheese() {
        return cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    public double finalPrice() {//Calculating final price
        double sizeCost = 0;
        switch (size) {
            case "Large":
                sizeCost = 14;
                break;
            case "Medium":
                sizeCost = 12;
                break;
            case "Small":
                sizeCost = 10;
                break;
        }
        double totalTopping = (cheese + pepperoni + ham) * 2;
        double finalPrice = totalTopping + sizeCost;
        return finalPrice;

    }

    public String getDescription() {//Description
        String description = "Pizza size: " + size + " Cheese: " + cheese + " Pepperoni " + pepperoni + " Ham "
                + ham + ". The total price is " + finalPrice();
        return description;
    }
}


