package introtojavabasics2;

import java.io.IOException;
/*
The throws keyword is used to IMPLICITLY throw an exception; it is used mainly to throw
CHECKED EXCEPTIONS (Those that we are FORCED to throw); we use it with the METHOD
SIGNATURE; technically throws also does the same thing the try...catch does

The throw keyword is used to MANUALLY/EXPLICITLY throw an exception; we can then add our own
conditions and rules; we use it WITHIN the method body or any block of code.
We CANNOT THROW multiple exceptions with one THROW
 */

interface  Sport{
    void calculateAveAge(int [] age);
    void retirePlayer(int id);
}
class Cricket implements Sport{
    int[] playersId = new int[11];
    Cricket(){
        System.out.println("Cricket");
    }
    public  void  calculateAveAge(int [] age){
        int i =0;
        int average = 0;
        for (int a: age){
            average += a;
        }
    }
    public  void retirePlayer(int id){
        int index = id;
        for (int a: playersId){
            if(a == id){
                playersId[index] = a;
                break;
            }
        }
    }
}