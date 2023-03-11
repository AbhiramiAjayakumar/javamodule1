package multithreading;

public class TestRunnable {

	public static void main(String[] args) {
		System.out.println("main started");
		System.out.println("Mains priority="+Thread.currentThread());
		MyRunnable runnable=new MyRunnable();
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		t1.setDaemon(true);
		t1.start();
		t2.start(); 
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("T1 priority ="+t1.getPriority());
		System.out.println("T2 priority ="+t2.getPriority());
		System.out.println("Main exited");
		

	}

}
