package introtojavabasics2;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundType {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            list.add(i);//This adds number to the list
        }
    }

    public class LowerBoundedTypeDriver {
        public static void main(String[] args) {
            List<Number> numberList = new ArrayList<>();
            addNumbers(numberList);
            List<Number> numberList2 = new ArrayList<>();
            addNumbers(numberList2);
            List<Object> numberList3 = new ArrayList<>();
            addNumbers(numberList3);
            //This will not work because String is not a super class of Integer
            /*
            List<String> numberlist4 = new ArrayList
            addnumbers(numberList4)
             */
           // NumericBounderType
        }

    }
}


