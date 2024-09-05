package org.leorodriguez.introtojavabasics;
/*
Mini version of a class in Java
 */

public class EnumerationExample {
    enum Card {
        SPADE, HEART, CLUB, DIAMOND
    }
    public static void main(String[] args) {
        //Reference variables to hold those ENUMERATORS
        Card spade = Card.SPADE;
        Card heart = Card.HEART;
        Card club = Card.CLUB;
        Card diamond = Card.DIAMOND;

        for (Card card : Card.values()){
            System.out.println(card);
        }
    }
}
