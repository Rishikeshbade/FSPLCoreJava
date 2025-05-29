package Threads;


class RunnableInterface1 implements Runnable{
	public void run() {
		for(int i = 1; i < 5; i++) {
			System.out.println("Runnable Thread 1 is Running!!"+Thread.currentThread().getName());
		}
	}
}

class RunnableInterface2 implements Runnable{
	public void run() {
		for(int i = 1; i < 5; i++) {
			System.out.println("Runnable Thread 2 is Running!!"+Thread.currentThread().getName());
		}
	}
}

public class ThreadExampleRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableInterface1 r1 = new RunnableInterface1();
		
		RunnableInterface2 r2 = new RunnableInterface2();
		
		Thread th1 = new Thread(r1);
		th1.setName(" Runnable Thread 1");
		
		Thread th2 = new Thread(r2);
		th2.setName(" Runnable Thread 2");
		
		//th1.run();
		
		//th2.run();
		
		th1.start();
		
		th2.start();
		
		System.out.println("Main Thread are Running!!");

	}

}
