package Term02ExamProgram;

public class OutOfBoundException extends Exception{
	public  OutOfBoundException (String message) {
		super(message);
	}

}
class Main {
	public static void main(String[] args) {
		try {
			int number=55;
			if (number<10 || number>50) {
				throw new OutOfBoundException("Number is Out of Range");
			}else {
				System.out.println("Number is in Range"+number*number);
			}
		
	}catch (OutOfBoundException e) {
		System.out.println("Exception: "+e.getMessage());
	}	
	}
}