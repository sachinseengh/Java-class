// package InputOutput;
import java.io.*;
public class ReadingFile {
    public static void main(String[] args) throws IOException  {
    
        File file = new File("input.txt");
        
         if(BufferedReader br = new BufferedReader(new UsingFileReader(file))) {
            String st;

            while((st = br.readLine()) != null){
                System.out.println(st);
            }
        }
    }
}
