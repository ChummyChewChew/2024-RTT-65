package org.leorodriguez;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }



    @Override
    public String attack() {
        String a = "Attack with stone";
        return a;
    }
}
