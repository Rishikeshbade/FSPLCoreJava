package Threads;

class Sleep extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
            System.out.println("Sleep Method is Running!!! " + Thread.currentThread().getName());
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        Sleep sl1 = new Sleep();
        Sleep sl2 = new Sleep();

        sl1.setName("Thread-1");
        sl2.setName("Thread-2");

        sl1.start(); 
        sl2.start();
    }
}
