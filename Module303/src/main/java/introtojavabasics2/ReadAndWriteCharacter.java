package introtojavabasics2;
import java.io.*;
public class ReadAndWriteCharacter {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            // change below file path as per your file path
            in = new FileReader("C:/Users/EzraWilliams/Downloads/testingFile.txt");
            out = new FileWriter("C:/Users/EzraWilliams/Downloads/sampleOutput3.txt");
            int c;
            while ((c = in.read()) != -1) {//reading while end of file (-1) is not yet encountered
                out.write(c); // writing data in output file
            }
            System.out.println("Reading and Writing in a file is done!!!");
        } catch (Exception e) {
            System.out.println(e);
        } finally {//finally executes whether there is an exception or not
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}