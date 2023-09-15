
class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\n");
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 10; i < 20; i++) {
            System.out.println(i + "\n");
        }
    }
}

public class Checks {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        Thread tt = new Thread(t1);
        Thread ttt = new Thread(t2);

        tt.setPriority(Thread.MAX_PRIORITY);
        ttt.setPriority(Thread.MIN_PRIORITY);
        tt.start();
        ttt.start();

    }

}
