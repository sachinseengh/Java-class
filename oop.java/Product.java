class Product{
    String name;
    int price ;
    String desc;

    public void set_product(String nam,int n,String descs){
        this.name=nam;
        this.price=n;
        this.desc=descs;
    }

    public String display(){
        return this.name+" "
        +this.price+" "+this.desc;
    
    }
}
