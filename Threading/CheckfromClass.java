

class Myclass extends Thread{
    public void run(){
        System.out.println("Hi");
    }
}



public class CheckfromClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        Thread tt = new Thread(t1);
        tt.start();
    }
}
