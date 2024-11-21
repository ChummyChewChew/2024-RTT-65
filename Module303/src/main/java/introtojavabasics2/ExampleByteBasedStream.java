package introtojavabasics2;
import java.io.*;
public class ExampleByteBasedStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:/Users/EzraWilliams/Downloads/testingFile.txt");
            out = new FileOutputStream("C:/Users/EzraWilliams/Downloads/sampleOutput4.txt");
            int c;
            while ((c = in.read()) != -1) { // read byte by byte
                out.write(c); // write byte by byte}
                System.out.println("Reading and Writing has been success!!");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}