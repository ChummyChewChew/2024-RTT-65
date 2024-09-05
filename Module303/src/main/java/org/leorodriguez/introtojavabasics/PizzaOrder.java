package org.leorodriguez.introtojavabasics;

    public class PizzaOrder{
        private Pizza[] pizzas;
        private int numPizzas;

        public PizzaOrder(){
            pizzas = new Pizza[3];
            numPizzas = 0;
        }
        public void addPizza(Pizza pizza){
            if (numPizzas < 3){
                pizzas[numPizzas] = pizza;
                numPizzas++;
            } else {
                System.out.println("Too much pizza :(");
            }
        }
        public double orderTotal(){
            double total = 0;
            for (int i = 0; i < numPizzas; i++) {
                total += pizzas[i].finalPrice();

            }
            return total;
        }
    }


