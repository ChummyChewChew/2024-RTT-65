package introtojavabasics2;

import java.util.ArrayList;
import java.util.Collections;
/*
the collections class is not be mistaken for the Collections interface
 */

public class ArrayListCollectionsSortExmample {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(13);
        numbs.add(7);
        numbs.add(5);
        numbs.add(9);
        numbs.add(8);
        System.out.println("Before "+ numbs);
        Collections.sort(numbs);
        System.out.println("After "+numbs);
    }
;}
