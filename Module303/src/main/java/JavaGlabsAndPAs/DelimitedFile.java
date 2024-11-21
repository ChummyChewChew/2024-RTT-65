package JavaGlabsAndPAs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class DelimitedFile {
    public static void main(String[] args) throws FileNotFoundException {
        try{ String local ="C:\\Users\\leona\\Downloads\\Testing Folder\\cars.csv";
            File file = new File(local);
            Scanner input = new Scanner(file);
            ArrayList<String[]> data = new ArrayList<String[]>();
            while (input.hasNextLine()){
                String Line = input.nextLine();
                String [] splittedLine =  Line.split(",");
                data.add(splittedLine);
            }
            for (String [] line: data){
                System.out.println("Car name : "+line[0]);
                System.out.println("MPG : "+line[1]);
                System.out.println("Cylinder : "+ line[2]);
                System.out.println("Displacement : "+ line[3]);
                System.out.println("Horsepower : "+ line[4]);
                System.out.println("Weight : "+ line[5]);
                System.out.println("Acceleration : "+ line[6]);
                System.out.println("Model : "+ line[7]);
                System.out.println("Origin : "+ line[8]);
                System.out.println("=====================");
            }
    } catch (FileNotFoundException e){
            e.printStackTrace();
        }
}
}