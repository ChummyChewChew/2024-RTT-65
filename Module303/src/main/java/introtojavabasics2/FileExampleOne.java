package introtojavabasics2;
import java.io.File;
import java.util.Arrays;
public class FileExampleOne {
    public static void main(String[] args) {
        //Absolute path -root element
        //Relative path - current directory of our program
        //C:\\Users\\EzraWilliams\\Downloads\\TestingFolder
        //home/user/EzraWilliams/Downloads/TestingFolder - Mac
        String path = "C:/Users/EzraWilliams/Downloads/TestingFolder";
        /*
        File class - most popular File manipulation class in Java
        File(String parent, String child)//path of parent, path of child
        File(File parent, String child)//parent file object, path of child
        File (URI uri) - Uniform Resource Identifier
         */
        File dir = new File(path);
        System.out.println(dir.isDirectory()); //Checks if it is a directory
        File[] FilewithPath =  dir.listFiles(); // return an  Array of Files
        System.out.println(Arrays.toString(FilewithPath));
        String path2 = "C:/Users/EzraWilliams/Downloads/testingFile.txt";
        File f = new File(path2);
        System.out.println("File Name: " + f.getName());
        System.out.println("File Path: " + f.getPath());
        System.out.println("Is path absolute: " + f.isAbsolute());
        System.out.println("Return Absolute path of the File " + f.getAbsolutePath());
        System.out.println("Return Parent folder of the given File " + f.getParent());
        System.out.println("File is Exist " + f.exists());
        System.out.println(f.exists() ? "Yes file exists" : "file does not exist");
        if(f.exists())  // return true or False
        {
            System.out.println("File is Found");
            System.out.println("IS file Readable " +  f.canRead());
            System.out.println("IS file Writable " +  f.canWrite());
            System.out.println("File size in a bytes " + f.length()); // file size in byte
        }
    }
}