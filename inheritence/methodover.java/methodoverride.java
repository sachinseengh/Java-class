class Vehicle{
    public void start(){
        boolean turn_key = true;
        System.out.println(turn_key);
    }
}
class Bike extends Vehicle{
    public void start(){
        boolean apply_kick=true;
        System.out.println("bike " +apply_kick);
    }
}



public class methodoverride {
    public static void main(String[] args) {
        
        Bike bb = new Bike();
        bb.start();
    }
}
