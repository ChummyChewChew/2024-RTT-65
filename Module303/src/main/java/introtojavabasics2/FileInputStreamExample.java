package introtojavabasics2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream idn = new FileInputStream("C:\\Users\\leona\\Downloads\\Testing Folder/DataFile.txt");
            int i =0;
            System.out.println(idn.read());
            while ((i=idn.read())!= -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}