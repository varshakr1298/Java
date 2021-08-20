package mulithreading;
//Way 1 of creating Thread that is by extending the thread class(Inheritance)
public class myThread extends Thread{
	public void run() {
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Thread Priority:"+Thread.currentThread().getPriority());
		System.out.println("My thread is running!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread m1=new myThread(); //m1 is in new state
		myThread m2=new myThread();
		m1.start(); //m1 is in runnable state
		m2.start();
//		System.out.println("System defined Thread Name: "+ m1.getName());
//		m1.setName("My Thread");
//		System.out.println("User set Thread Name: "+ m1.getName());
//		System.out.println("Thread Priority: "+ m1.getPriority());
//		myThread m2=new myThread();
//		m2.start();
//		System.out.println("Thread Name: "+ m2.getName());
//		System.out.println("Thread Priority: "+ m2.getPriority());
//		//Using already built in class thread
//		Thread t1=new Thread();
//		t1.start();
//		System.out.println("Thread Name: "+ t1.getName());
//		System.out.println("Thread Priority: "+ t1.getPriority());
	}
}
