public class Test1 {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);}}.start();



                new Thread(){
                    public void run(){
                        c.deposit(100000);}}.start();
                    }
                }
        
        
    

