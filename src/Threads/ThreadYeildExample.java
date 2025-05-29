package Threads;

class Yeild implements Runnable{
	public void run() {
		for(int i = 1; i < 5; i++) {
			System.out.println("Thread is Yeild Method!!!"+Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

public class ThreadYeildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Yeild yeild = new Yeild();
		
		Thread th1 = new Thread(yeild);
		th1.setName(" Yeild Method!! 1");
		
		Thread th2 = new Thread(yeild);
		th2.setName(" Yeild Method 2");
		
		th1.start();
		th2.start();

	}

}
