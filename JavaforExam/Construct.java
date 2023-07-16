package JavaforExam;


class Const{
    public Const(String name){
        System.out.println("Hello "+ name);
    }
    int price=5;
}





public class Construct {
    public static void main(String[] args) {
        Const cc = new Const("Sachin");
        System.out.println(cc.price);
    }
}
