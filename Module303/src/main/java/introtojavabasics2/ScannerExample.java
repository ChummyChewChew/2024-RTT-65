package introtojavabasics2;
import java.util.Scanner;
import java.io.*;
public class ScannerExample {
    public static void main(String[] args) {
        try {
//------- change the location of the file-----.
            File file = new File("C:/Users/EzraWilliams/Downloads/testinFile.txt");
            Scanner sc = new Scanner(file);//Scanner object with the file as the argument
            String data = "";//Create a string
            while (sc.hasNextLine()) {//While there are more lines to read
                data = sc.nextLine();//read each line and save it in data
                System.out.println(data);//print each line
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Either file is not found or file is not able to access");
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
}