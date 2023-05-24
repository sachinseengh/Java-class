public class q4fibo {
    public static void main(String[] args) {
        int n=5;
       int a=0;
        int b=1;
        
        for(int i=1;i<=n;i++){
            System.out.printf("%d\t",a);
           int c=a+b;
            a=b;
            b=c;
        }
    }
}
