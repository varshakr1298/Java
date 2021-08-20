package mulithreading;

public class childThread1 implements Runnable{
	public Thread t;
	public childThread1(){
		t=new Thread(this,"Demo Thread1");
		System.out.println("Thread Information of child B: "+t);
	}
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("\nChild Thread B: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.print(e);
		}
		System.out.println("\nChild Thread B exited!");
	}
}
