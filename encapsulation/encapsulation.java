
class Pen{
    // private String name="sachin";
    // int price;
    // String brand;
    private String name;
    private int price;
    private String brand;

    public void setdetails(String nam, int pr,String br){
        this.name=nam;
        this.price=pr;
        this.brand=br;
    }
    public void details(){
        System.out.println("name  "+this.name+"  price  "+this.price+"  brand "+this.brand);
    }
}

// public class encapsulation {
//     public static void main(String[] args) {
        
//         // Pen p=new Pen();
//         // p.write();
//     }
// }
