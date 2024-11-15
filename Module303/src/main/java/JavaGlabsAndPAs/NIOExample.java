package JavaGlabsAndPAs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import  java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        //Initialise two files in a array
        String [] inputFiles = {"C:\\Users\\leona\\Downloads\\Testing Folder\\file1.txt", "C:\\Users\\leona\\Downloads\\Testing Folder\\file2.txt"};
        //Specify out files with path location
        //Files contents will be written in these files
        String outputFile ="C:\\Users\\leona\\Downloads\\nioOutput.txt";

        //Get channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {
            //Get channel for inputfiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();
            long size = inputChannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            System.out.println((char)buf.get());
            while (inputChannel.read(buf)> 0){
                buf.flip();
                while (buf.hasRemaining()){
                    System.out.println((char)buf.get());
                    targetChannel.write(buf);
                }

            }
        }
    }
}
