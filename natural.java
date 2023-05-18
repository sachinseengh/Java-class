import java.util.Scanner;



public class natural{
    public static void main(String[] args) {
        
   System.out.println("input your number ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();


        System.out.println("The natural numbers are:");
        for(int i=1;i<=n;i++){
            
            System.out.println(i);
        }
    }
}