package JavaforExam;

public class Throwss {
    public static void div(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        try{
            div(8,0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    
}
