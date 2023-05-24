import java.util.Random;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        Random rc=new Random();
        int computerguess=rc.nextInt(100);
        // System.out.println(computerguess)
        Scanner sc=new Scanner(System.in);
        
        // int yourguess=sc.nextInt();
        System.out.println("Enter your guess");
            int yourguess=sc.nextInt();
       
            int attempt=1;
        while(computerguess != yourguess){
            
        

             attempt++;
             if(yourguess>computerguess){
                System.out.println("your number is greater");
             }else{
                System.out.println("Your number is less");
             }
             System.out.println("Enter next guess");
             yourguess=sc.nextInt();
            
        }

        System.out.println("You won in "+attempt+" attempt");

    }
}
