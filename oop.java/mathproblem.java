
class Math{
    int n1=5;
    int n2=8;

    public void sum(){
        System.out.println("sum is "+(n1+n2));
    }
    public void sub(){
        System.out.println("sub is "+(n1-n2));
    }
    public void mul(){
        System.out.println("mul is "+(n1*n2));
    }
    public void div(){
        System.out.println("div is "+(n1/n2));
    }
}

public class mathproblem {
    public static void main(String[] args) {
        
        Math mm=new Math();

        mm.sum();
        mm.sub();
        mm.mul();
        mm.div();
    }
}
