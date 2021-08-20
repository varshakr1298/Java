package mulithreading;

public class childThread implements Runnable{
	public Thread t;
	public childThread(){
		t=new Thread(this,"Demo Thread");
		System.out.println("Thread Information of Child A: "+t);
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("\nChild Thread A: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.print(e);
		}
		System.out.println("\nChild Thread A exited!");

	}
}
