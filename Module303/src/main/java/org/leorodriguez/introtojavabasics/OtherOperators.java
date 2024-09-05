package org.leorodriguez.introtojavabasics;
/*Now we will go over other operators
Relational operators
Conditional operators
Assignment operators
Unary operators
 */
public class OtherOperators {
    /*These operators -compare two values and return a boolean value
    equal to (==) not equal to (!=) greater than (>) less than (<) => <=, instance of

     */
    public static void main(String[] args) {


        int a =3, b= 4;
        boolean r;
        r = (a == b);
        System.out.println(r);// false
        r = (a !=b); //true
        System.out.println(r);
        r = (a > b);// false
        System.out.println(r);
        r = (a < b);//true
        System.out.println(r);
        r = (a>=b); //false
        System.out.println(r);
        r = (a <= b); //true
        System.out.println(r);

        /* conditional operates used to combine conditional statements and return a boolean
        They are short circuit- this means that if the first operation is false, it does not check the other operation and checks it all as false
         */
        //logical and
        System.out.println(a<b && b<a); //true and false so it returns false
        System.out.println(a>b && b>a );// false and true so it returns false
        System.out.println(a<b && b>a); //True and true, so it returns true

        //logical or
        System.out.println(a<b || b<a); //True or false, so it returns true
        System.out.println(a>b || b>a); //False or true so it returns true
        System.out.println(a<b || b>a); //True and true so it returns true

        //Assignment Operators
            int x = 0;
            x = x =5; //x+5;
            x = x - 5; //x-=5
            //Shortened version - x*=5, x/=5;
            x = x * 5; //x*=5
            x = x / 5; //x/=5
            x = x % 5; //x%=5
            x = x << 5; //x<<=5
            x = x >> 5; //x>>=5
            x = x & 5; //x&=5
            x = x | 5; //x|=5
            x = x ^ 5; //x^=5

            //Unary Operators
            int A =20, B = 10, C =0, D=20, E =40, F =30;
            //Unary Minus
            int result = -A;
        System.out.println(result);

            //Increment operator
            //Post-Increment
            C = B++;
        System.out.println("Value of c (b++) "+ C);
        //Value of C (B++) =10
        System.out.println("Value of B = "+ B);

            //Pre-increment
        C =++A;
        System.out.println("Value of c (++A)= "+C);
        //Value of C(++A) =21
        System.out.println("Value of A + "+ A);

        //Post decrement

        C = E--;
        System.out.println("Value of C (--E)= "+C);
        //Value of C (E--) = 40
        System.out.println("Value of E + "+ E);

        //Pre decrement
        C = --D;
        System.out.println("Value of C (C--) = "+ C);
        //value of c (--D) = 19
        System.out.println("Value of D + "+ D);





    }
}
