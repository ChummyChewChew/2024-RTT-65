package org.leorodriguez.introtojavabasics;

public class StaticDriver {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();
        StaticDemo obj4 = new StaticDemo();
        StaticDemo obj5 = new StaticDemo();
        /* only one copy of static variable will create and shared among all the instances of class but 5 copies of class variable will be create */
        System.out.println(" invoking static variable");
        StaticDemo.var1 = 30;
        obj2.var1 = 40;
        obj3.var1 = 50;
        obj4.var1 = 60;
        obj5.var1 = 70;
        System.out.println(obj1.var1);
        System.out.println(obj2.var1);
        System.out.println(obj3.var1);
        System.out.println(obj4.var1);
        System.out.println(obj5.var1);
        System.out.println(" invoking non static variable");
        obj1.var3 = 200;
        obj2.var3 = 300;
        obj3.var3 = 400;
        obj4.var3 = 500;
        obj5.var3 = 600;
        System.out.println(obj1.var3);
        System.out.println(obj2.var3);
        System.out.println(obj3.var3);
        System.out.println(obj4.var3);
        System.out.println(obj5.var3);

    }
}