package org.leorodriguez.introtojavabasics;

import java.util.StringJoiner;

public class StringJoinerPractice {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(","); //Put in between what you are joining
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("Javascript");
        joinNames.add("Javascript");
        System.out.println(joinNames.toString());
    }
}
