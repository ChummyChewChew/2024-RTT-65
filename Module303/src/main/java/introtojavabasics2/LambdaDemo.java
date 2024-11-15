package introtojavabasics2;
import java.util.ArrayList;
import java.util.List;
public class LambdaDemo {
    public static void main(String[] args) {
        /*
        No name function
        The parameters (zero parameters)
        -> - what do we do here? an expression follows  (lambda operator)
        body - the main part of our function - curly braces{}
        optional return type
         */
        //NO PARAMETER, NO RETURN TYPE EXAMPLE
        /*Human HMsg = () -> { //optional - one statement
            System.out.println("Hello, it's me again, James");
        };
        HMsg.say();//we are using lambda expressions to implement our functional interface function
        HMsg.sleep();
        Human.communication();*/
        //ONE PARAMETER, NO RETURN TYPE
        /*
        The parentheses are optional, curly braces optional (one statement)
        Human HMsg = (st) -> {
            System.out.println(st+" It's me Tony");
        };
        HMsg.say("Hello | ");
    */
        //ONE PARAMETER, RETURN TYPE:
        Human obj = () ->{
            String a = "Hello Tony";
          //  return a + st;
        };
        // String greeting = obj.say(". How are you doing?");
        //System.out.println(greeting);
        //MULTIPLE PARAMETERS/NO RETURN STATEMENT:
        MultipleParameterDemo sObj1 = (st1, st2, st3) ->
                System.out.println(st1 + st2 + st3);
        sObj1.concatString("hello | ", "Per Scholas ","Students");
        //MULTIPLE PARAMETERS/ RETURN STATEMENT:
        MultipleDemoReturn addObj1 = (a,b,c) -> { return (a + b + c); };
        double resultObj1 = addObj1.Calculator(10,20,30);
        System.out.println(resultObj1);
        List<String> names = new ArrayList<String>();
        names.add("Larry");
        names.add ("Steve") ;
        names.add ("James") ;
        names.add ( "Conan") ;
        names.add ( "Ellen") ;
        names.forEach (name -> {  System.out.println (name);    } );
    }
}