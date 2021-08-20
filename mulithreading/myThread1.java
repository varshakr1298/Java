package mulithreading;
//Way 2 of creating a thread in java is by implementing Runnable interface
public class myThread1 implements Runnable {
	public void run() {
		System.out.println("My thread is running....!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myThread1 object=new myThread1();
		Thread t1=new Thread(object); // t1 is in new state, Thread t1=new Thread(Runnable object)
		System.out.println("Thread name : "+t1.getName());
		t1.start();// t1 is in runnable state
		Thread t2=new Thread(object,"My Thread"); // Thread t1=new Thread(Runnable object, String name)
		t2.start();
		System.out.println("Thread name : "+t2.getName());
	}

}
