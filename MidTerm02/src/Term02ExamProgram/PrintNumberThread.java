package Term02ExamProgram;
class PrintNumberThread implements Runnable{
	private int start;
	private int end;
	 
	public PrintNumberThread(int start,int end) {
		this.start=start;
		this.end=end;
	}public void run() {
		if(start<end) {
			for(int i=start;i<=end;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
			
		}else {
			for(int i=start;i>=end;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
	}
	}
}

public class Diksha{
	public static void main(String[] args) {
		Thread t1=new Thread(new PrintNumberThread(1,100));
		Thread t2=new Thread(new PrintNumberThread(100,1));
		t1.start();
		t2.start();
	}
}
}