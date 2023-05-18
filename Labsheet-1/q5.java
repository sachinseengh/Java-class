
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int n1=sc.nextInt();
        System.out.println("Enter your second number");
        int n2=sc.nextInt();
        System.out.println("Enter the operation u want to perform, +,-,*,/");
        char c=sc.next().charAt(0);

        switch(c){
            case '+':
                     System.out.println("sum is "+(n1+n2));
                     break;
            case '-':
                     System.out.println("sub is "+(n1-n2));
                     break;
            case '*':
                     System.out.println("mul is "+(n1*n2));
                     break;
            case '/':
                     System.out.println("div is "+(n1/n2));
                     break;
        }
    }
}
