package JavaGlabsAndPAs;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
public class NioExampleTwo {
    public static void main(String[] args) throws IOException {
        //InputFiles
        String [] inputFiles = {"C:\\Users\\leona\\Downloads\\Testing Folder\\file1.txt", "C:\\Users\\leona\\Downloads\\Testing Folder\\file2.txt"};
        //Files contents will be written in these files
        String outputFile = "C:\\Users\\leona\\Downloads\\Testing Folder\\OutputExampleTwo.txt";
        //Get channel for outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();
        for (int i =0; i < inputFiles.length; i++){
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //Close the input channel
            inputChannel.close();
            fis.close();
        }
        //Close the target channel
        targetChannel.close();
        fos.close();
    }
}
