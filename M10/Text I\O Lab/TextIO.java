import java.io.File;
import java.util.*;
import java.io.*;
public class TextIO {
    public static void main (String [] args){
        File file = new File("RandomIntegers.bin");
        FileOutputStream output = new FileOutputStream("RandomIntegers.bin");
        Random rand = new Random();
        int [] arr = new int [10];
        //writes 10 random integers to the file RandomIntegers.bin
        for (int i = 0; i<10; i++){
              //generates a random number in the range [-100, 100)
              arr[i] = (rand.nextInt(200)-100);
              output.write(arr[i]);
        }
        output.close();
        FileInputStream input = new FileInputStream("RandomIntegers.bin");
        //reads file and prints to output stream
        for (int i = 0; i<10; i++){
            int n = input.read();
            System.out.println(n);
      }

    }


}