
class F{
    public  int fact(int n){
        if(n== 0 || n ==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
}

}

public class Factorial {
    public static void main(String[] args) {
        int a =5;
        F ff = new F();
        int b = ff.fact(a);
        System.out.println("factorial is :"+ b);
    }
}
