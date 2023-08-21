// package Threading;


public class Priority implements Runnable {
    public void run(){
        
             System.out.println(Thread.currentThread());  
    }
    public static void main(String[] args) {
        Priority pp = new Priority();
        Thread t = new Thread(pp,"New Thread");
        Thread t2 = new Thread(pp,"New Thread-2");
        Thread t3 = new Thread(pp,"New Thread-3");
    
        t.setPriority(4);
        t2.setPriority(2);
        t3.setPriority(8);
        t.start();
        t2.start();
        t3.start();
    }
    
}
