package Thread;

public class Multi2 implements Runnable{

		public void run() {
			System.out.println("Thread is Running...");
			
		}
	public static void main(String[] args) {
		Multi2 m1=new Multi2();
		Thread t1=new Thread(m1);//using the constructor thread
		t1.start();
	}
	}
	


