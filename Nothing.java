
public class Nothing {

    public static void main(String[] args) {
        int a = 523;
        int rev = 0;
        while (a > 0) {
            int r = a % 10;
            rev = rev * 10 + r;
        }
        System.out.println(rev);
        System.out.println("Hello");

    }
}
