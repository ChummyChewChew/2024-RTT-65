package introtojavabasics2;
import java.io.*;
public class WriteDataInFile {
    public static void main(String[] args) throws IOException {
        // Change below path as per your PC
        FileWriter fileWriter = new FileWriter("C:/Users/EzraWilliams/Downloads/output.txt");
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E'};
        String content = "I love my country \n";
        fileWriter.write(content);
        fileWriter.write(chars);
        fileWriter.close();
    }
}