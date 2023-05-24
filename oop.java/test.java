public class test {
    public static void main(String[] args) {
        Product p=new Product();
        // p.display();
        p.set_product("iphone", 45555, "apple inc");

      String detail =  p.display();
      System.out.println(detail);
    }
}
