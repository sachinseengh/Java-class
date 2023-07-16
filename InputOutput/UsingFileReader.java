// package InputOutput;
import java.io.*;

public class UsingFileReader {


    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("input.txt");

        int i;
        while((i=r.read()) != -1){
            System.out.println((char)i);
        }

    }

    
}
