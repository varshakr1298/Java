package mulithreading;

public class TestSleepMethod1 extends Thread{
	
	 public void run(){  
		 TestSleepMethod1 t=new TestSleepMethod1();
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(1000); //static sleep method 
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(t.getName()+" "+i);
		  }  
		  //System.out.println(t.getName()+" is exited!");
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestSleepMethod1 t1=new TestSleepMethod1(); //Thread t1 
		 TestSleepMethod1 t2=new TestSleepMethod1(); //Thread t2
		 TestSleepMethod1 t3=new TestSleepMethod1(); //Thread t3
		 TestSleepMethod1 t4=new TestSleepMethod1(); //Thread t3
		 t2.start(); //Thread - 4
		 try {
			 t2.join(1500);
		 }catch(InterruptedException e) {
			 System.out.println(e);
		 }
		 t1.start(); //Thread - 5
		 try {
			 t1.join();
		 }catch(InterruptedException e) {
			 System.out.println(e);
		 }
		 t3.start(); //Thread - 3
		 t4.start();
	}
}
