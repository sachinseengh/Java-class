package JavaforExam;

class Encap{
    private int price;
    private String name;


    public void setname(String names){
        this.name = names;
    }
    public void setprice(int price){
        this.price = price;
    }
    public String getname(){
        return this.name;
    }
    public int getprice(){
        return this.price;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap en = new Encap();
            en.setname("Sachin");
            System.out.println(en.getname());
        
    }
}
