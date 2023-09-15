
import java.util.Scanner;

public class Reverse {

    static int facto(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }

    static int natural(int n) {
        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else {
            return n + natural(n - 1);
        }
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        // int a = 523;
        // int rev = 0;
        // while (a > 0) {
        // int r = a % 10;
        // rev = rev * 10 + r;
        // a=a/10;
        // }
        // System.out.println(rev);
        // System.out.println("Hello");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // int c;

        // for (int i = 0; i < n; i++) {
        // System.out.print(a);

        // c = a + b;
        // a = b;
        // b = c;
        // }

        // Factorial
        // int fact=1;
        // for(int i = 1;i<=n;i++){
        // fact = fact*i;
        // }
        // System.out.println(fact);

        // Using recursion
        // int f = facto(n);
        // System.out.println(f);

        // natural using recursion
        // System.out.println(natural(n));

        // fibonacci using recursive
        // for (int i = 0; i < n; i++) {
        // int j = fibo(i);
        // System.out.print(j);
        // }

        // char c = 'a';
        // c++;
        // System.out.println(c);
        String name = "sachin";
        // // System.out.println(name);
        // String name2 = new String("hi");
        // System.out.println(name2);

        // StringBuffer name3 = new StringBuffer("hello");
        // System.out.println(name3.reverse());

        char s[] = new char[10];
        for (int i = 0; i < name.length(); i++) {
            s[i] = name.charAt(i);
        }
        // System.out.println();

        String ss = new String(s);
        System.out.println(ss.getClass());

    }
}
