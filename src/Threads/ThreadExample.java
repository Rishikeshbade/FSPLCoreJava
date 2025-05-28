package Threads;


class MyThread1 extends Thread{
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread 1 is running!!"+getName());
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread 2 is running!!"+getName());
		}
	}
}

class MyThread3 extends Thread{
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread 3 is running!!"+getName());
		}
	}
}



public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 th1 = new MyThread1();
		th1.setName(" Thread 1");
		
		MyThread2 th2 = new MyThread2();
		th2.setName(" Thread 2");
		
		MyThread3 th3 = new MyThread3();
		th3.setName(" Thread 3");
		
		th1.start();
		th2.start();
		th3.start();
		
		//th1.run();
		//th2.run();
		//th3.run();
		
		System.out.println("Main Thread is Running!!");

	}

}
