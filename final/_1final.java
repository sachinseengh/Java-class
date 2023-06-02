

class B{
    final void print(){
        System.out.println("B");
    }
}
class C extends B{

void hi(){
    System.out.println("hi");
}



    // void print(){
    //     System.out.println("c");
    // }


}

public class _1final {
    public static void main(String[] args) {
        C ccc = new C();
        ccc.hi();
        System.out.println("hello");
}
    }
    
