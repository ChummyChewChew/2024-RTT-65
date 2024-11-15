package introtojavabasics2;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class ChannelDemoTwo {
    public static void main(String args[]) throws IOException {
        //File path:
        String fname = "C:/Users/EzraWilliams/Downloads/testingFile.txt";
        //Create the file object and the byte stream object
        FileInputStream file = new FileInputStream(fname);
        /*
        1. Create and open the object of the file channel
        The file channel is like a stream but it represents the connection
        between the data source and the data destination:
         */
        FileChannel fileChannel = file.getChannel();
        //2. Declare and initialize the Buffer size:
        long filesize =  fileChannel.size();
        // intializing buffer,
        // ByteBuffer buffersize  =  ByteBuffer.allocate(200);
        /*
        A buffer is an object that holds data - that data is to be written to
        or to be read from:
         */
        ByteBuffer byteBuffer  =  ByteBuffer.allocate( (int) filesize);
        // 3. read data from a channel into buffer
        while (fileChannel.read(byteBuffer) > 0) {
            // flip the buffer to prepare for get operation
            //reads and write so we read to it and we flip for writing
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                //get() method used to read data from buffer and
                // read 1 byte at a time from buffer (cast output as char)
                System.out.print((char) byteBuffer.get());
            }
        }
        file.close();
        fileChannel.close();
    }
}