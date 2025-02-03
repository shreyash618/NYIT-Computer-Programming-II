import java.lang.*;
import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadWriteNames {
    public static void main (String [] args){
        String [] names = {"Harry", "Siegfried", "Juliana", "Jessie", "Divya"};
        try (FileOutputStream outputStream = new FileOutputStream("file.txt")){
            //write to file
            for (String name:names){
            byte[] nameToBytes = name.getBytes();
                outputStream.write(nameToBytes);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try (FileInputStream inputStream = new FileInputStream("file.txt")){
            //read from file
            for (int i = 0; i< 5; i++){
                byte [] byteToString = inputStream.read();
                System.out.println (byteToString);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


        outputStream.close();
    }
}
