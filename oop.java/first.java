
class Car{
    int price=5000;
    String model="swift";

    public void Start(){
        System.out.println("Start");
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
        Car c=new Car();
        c.Start();
        c.Turnleft();
        c.Stop();
    }
}
