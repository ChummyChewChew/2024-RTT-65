package JavaGlabsAndPAs;

public class GLABGenericsDriver {
    public static void main(String[] args) {
        DemoClass dObj = new DemoClass();
        dObj.genericsMethods(25);
        dObj.genericsMethods("Per Scholas");
        dObj.genericsMethods(2563.5);
        dObj.genericsMethods('H');

        //Initialize generic class
        //With String and Integer data

        GMultipleDataType<String, Integer> mobj = new GMultipleDataType("Per Scholas", 11025);
        System.out.println(mobj.valueone);
        System.out.println(mobj.valuetwo);

        //Initialize generic class
        //With String and String data

        GMultipleDataType <String, String> mobj2 = new GMultipleDataType("Per Scholas", "non profit");
        System.out.println(mobj2.valueone);
        System.out.println(mobj2.valuetwo);


    }
}
