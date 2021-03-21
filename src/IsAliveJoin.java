public class IsAliveJoin extends Thread {
    public void run() {
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread." + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        IsAliveJoin t1 = new IsAliveJoin();
        t1.start();
        IsAliveJoin t2 = new IsAliveJoin();
        t2.start();
        IsAliveJoin t3 = new IsAliveJoin();
        t3.start();
        System.out.println("Thread 1 is alive " + t1.isAlive());
        System.out.println("Thread 2 is alive " + t2.isAlive());
        System.out.println("Thread 3 is alive " + t3.isAlive());
        try {
            System.out.println("Waiting for threads to finish.");
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread 1 is alive " + t1.isAlive());
        System.out.println("Thread 2 is alive " + t2.isAlive());
        System.out.println("Thread 3 is alive " + t3.isAlive());
        System.out.println("Main thread exiting.");
    }
}