package org.leorodriguez.introtojavabasics;
import java.util.Arrays;

public class DeepOrShallow {

    public class DeepOrShallowArray {
        public static void main(String[] args) {
            String[] stringArray = {"Meagan", "Goyo", "Jessica", "Tamaura"};
            String[] stringArray2 = new String[stringArray.length];
            stringArray2 = stringArray;
            System.out.println(Arrays.toString(stringArray));
            System.out.println(stringArray);
            System.out.println(Arrays.toString(stringArray2));
            System.out.println(stringArray2);
            stringArray[0] = "Steve";
            System.out.println(Arrays.toString(stringArray));
            System.out.println(stringArray);
            System.out.println(Arrays.toString(stringArray2));
            System.out.println(stringArray2);


        }
    }
}