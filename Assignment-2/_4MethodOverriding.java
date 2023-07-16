
class Vehicle{
    public void start(){
        System.out.println("vehicle starting");
    }
}
class Ram extends Vehicle{
    @Override
    public void start(){
        System.out.println("Ram car is starting");
    }
}



public class _4MethodOverriding {
    public static void main(String[] args) {
        Vehicle vv = new Vehicle();
        Ram rr = new Ram();

        vv.start();
        rr.start();
    }
}
