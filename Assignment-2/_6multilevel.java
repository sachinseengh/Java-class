class A1{
    public int a=10;
}
class A2 extends A1{
    public int b=45;
}
class A3 extends A2{
    public int c=45;
}

public class _6multilevel {
    public static void main(String[] args) {
        A3 a3 = new A3();
        System.out.println(a3.a);
    }
}
