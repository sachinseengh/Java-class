
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowingFile {
    public static void main(String[] args) {
        File directoryPath = new File("C:\\Users\\sachi\\OneDrive\\Desktop\\Java class\\FileforIO");
        File filesList[] = directoryPath.listFiles();
        Scanner sc = null;

        for(File file : filesList){
            System.out.println("File name : "+file.getName());
            System.out.println("File path : "+file.getAbsolutePath());
            System.out.println("File size : "+file.getTotalSpace());
        }
    }
}
