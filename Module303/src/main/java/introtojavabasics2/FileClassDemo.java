package introtojavabasics2;
import java.io.File;
import java.io.IOException;
public class FileClassDemo {
    public static void main(String[] args) {
        try{
            File f = new File("C:/Users/EzraWilliams/Downloads/Datafile.txt");
            File f1 = new File("C/Users/EzraWilliams/Downloads/MyFolder");
            if (f1.mkdir()){
                System.out.println("Folder created");
            } else{
                System.out.println("Folder not created");
            }
            if (f.createNewFile()){
                System.out.println("New File created");
            } else {
                System.out.println("The file already exists");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}