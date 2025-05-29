package Threads;

class Join1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Running thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("Thread is Interrupted!! ");
            }
        }
    }
}

class Join2 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Running thread: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("Thread is Interrupted!! ");
            }
        }
    }
}

public class JoinExample {

    public static void main(String[] args) {

        Join1 join = new Join1();
        join.setName("Thread-1");
        
        Join2 jn = new Join2();
        jn.setName("Thread-2");
        
        join.start();
        jn.start();

        try {
            join.join(); 
            jn.join();
        } catch (Exception e) {
            System.out.println("Main Thread is Interrupted!!");
        }

        System.out.println("Main thread completed.");
    }
}
