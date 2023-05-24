
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll no");
        int roll=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your percentage");
        float percentage=sc.nextFloat();


        System.out.println("your name,roll and percentage are "+name+","+roll+" and "+percentage+" respectively");
    }
}
