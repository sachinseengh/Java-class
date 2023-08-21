// package InputOutput;
import java.io.*;

public class FileReadWrite {
    
public static void main(String args[]){
    FileInputStream in = null;
    FileOutputStream out = null;

    try{
        in = new FileInputStream("input.txt");
        out = new FileOutputStream("output.txt");

        int c;
        while((c = in.read()) != -1){
            out.write(c);
        }
    }catch(IOException e){
            System.out.println(e);
        }
        finally{
            try{
            if(in != null){
                in.close();
            }}catch(IOException e){
                System.out.println(e);
            }
             try{
            if(in != null){
                out.close();
            }}catch(IOException e){
                System.out.println(e);
            }
        }
    }
}

