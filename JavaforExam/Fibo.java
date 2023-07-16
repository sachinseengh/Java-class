package JavaforExam;

public class Fibo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        for(int i=0;i<n;i++){
          System.out.printf("%d\t",i);
          int c=a+b;
          a=b;
          b=c;
        }
    }
}
