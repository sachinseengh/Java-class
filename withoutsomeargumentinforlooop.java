
import java.util.Scanner;



public class withoutsomeargumentinforlooop {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int input=sc.nextInt();
        int j=1;
        int sum=0;
        for(;j<=input;){
            if( j%2  == 0){
                sum=sum+j;
            }
            // if(j%2 != 0){
            //     continue;
            // }


            // sum=sum+j;
        }
        System.out.println(sum);
    }
}
