package introtojavabasics2;
/*
Character-based stream classes read character by character (Unicode)
The super classes are Reader and Writer
FileReader is a subclass of Reader
 */
import java.io.FileReader;
public class FileReaderExampleOne {
    public static void main(String[] args) {
        try
        {
        /*
        This will read from the file one character at a time:
         */
            FileReader fr = new FileReader("C:/Users/EzraWilliams/" +
                    "Downloads/testingFile.txt");
       /* System.out.println(fr.read());//read method will read one char at a time
        int data = fr.read();//we are able to do this because we are reading one char at a time
        System.out.println(data); // typeCasting: because return a character in ASCII form
        fr.close();*/
            int i = 0;
            while ((i = fr.read()) != -1)   /* read() reading a single character.
return a character in ASCII form.  It returns -1 at the end of file. */
            {  //   System.out.print(i);
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println("Cannot read the file");
            e.printStackTrace();
        }
    }
}