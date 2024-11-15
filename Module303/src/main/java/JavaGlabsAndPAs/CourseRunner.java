package JavaGlabsAndPAs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class CourseRunner {
    public static void main(String[] args) {
        try {
            String location ="C:\\Users\\leona\\Downloads\\Testing Folder\\CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<course> data = new ArrayList<>();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String [] splitedLine = line.split(",");
                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourseName(splitedLine[1]);
                cObj.setInstructorName(splitedLine[2]);
                data.add(cObj);
            }
            for (course c : data) {
                System.out.println(c.getCode()+" | "+ c.getCourseName()+ "|"+ c.getINstructorName());
                System.out.println("================");
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
