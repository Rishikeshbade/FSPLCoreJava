package Threads;

class Join extends Thread {
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

        Join join = new Join();
        join.setName("Thread-1");
        join.start(); 

        try {
            join.join();  
        } catch (Exception e) {
            System.out.println("Main Thread is Interrupted!!");
        }

        System.out.println("Main thread completed.");
    }
}
