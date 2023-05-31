
interface Meth1{
    void sum(int x , int y);
    void sub(int  x, int y);
}
interface Meth2{
    void mul(int x , int y);
    void div(int  x, int y);
}
interface Calc extends Meth1,Meth2{
    void rem(int x, int y);
}

class Calc1 implements Calc{
    public void sum(int x,int y){
        System.out.println("adding : "+(x+y));
    }
    public void sub(int x,int y){
        System.out.println("adding : "+(x-y));
    }
    public void mul(int x,int y){
        System.out.println("adding : "+(x*y));
    }
    public void div(int x,int y){
        System.out.println("adding : "+(x/y));
    }
    public void rem(int x,int y){
        System.out.println("adding : "+(x%y));
    
}
}


public class Icalculator {
    public static void main(String[] args) {
        Meth2 cc = new Calc1();
        cc.mul(5,2);
    }
}
