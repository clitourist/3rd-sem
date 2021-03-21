import java.lang.Thread;
public class Print extends Thread{

    public static void main(String[] args)throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    sleep(3000);
                    System.out.println("Hello");
                } catch (InterruptedException e) {
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    sleep(5000);
                    System.out.println("Hi");
                } catch (InterruptedException e) {
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                    sleep(7000);
                    System.out.println("Welcome");
                } catch (InterruptedException e) {
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

}