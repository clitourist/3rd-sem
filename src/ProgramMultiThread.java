class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(1000);
                System.out.println("Good Morning");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(2000);
                System.out.println("Hello");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

class ThreadThree extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(3000);
                System.out.println("Welcome");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class ProgramMultiThread {
    public static void main(String args[]) {
        System.out.println("Name : Vedansh\nUSN : 1DS19CS186");
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        t1.start();
        t2.start();
        t3.start();
        try {
//Thread.sleep (15000);
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Main Thread Exits");
    }
}
