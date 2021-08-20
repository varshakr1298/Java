package mulithreading;

public class daemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("My thread is daemon thread..!");
		}else {
			System.out.println("I am a user thread..!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daemonThread thread1=new daemonThread();
		thread1.setDaemon(true);
		thread1.start();
		daemonThread thread2=new daemonThread();
		thread2.start();
	}

}
