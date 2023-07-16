
class Car{
    int price=5000;
    String model="swift";

    public void Start(String n){
        System.out.println(n+" Start");
    }
    public void Stop(){
        System.out.println("Stop");
    }
    public void Turnleft(){
        System.out.println("Turnleft");
    }
}
public class first {
    public static void main(String[] args) {
        Cars c=new Cars();
        c.Start("red");
        c.Turnleft();
        c.Stop();
    }
}
