package JavaGlabsAndPAs;

import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookdetails();
        for(Book showValue: myBookList){
            //Ivoking getter method for getting data
            System.out.println(showValue.getNumber()+ " " + showValue.getName()+ " " +
                    showValue.getCategory()+ " "+ showValue.getAuthor());
        }
    }
}
