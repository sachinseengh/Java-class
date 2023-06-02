package nestedclass;

class A {
    class B {
        public void display() {
            System.out.println("B");
        }
    }
}

public class nest{
    public static void main(String[] args) {
        A a = new A();
        A.B bb = a.new B();
        bb.display();
    }
}