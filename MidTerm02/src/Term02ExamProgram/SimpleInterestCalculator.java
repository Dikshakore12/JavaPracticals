package Term02ExamProgram;
import java.util.Scanner;

public class SimpleInterestCalculator {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Principle Ammount: ");
	 double principle=sc.nextDouble();
	 
	 System.out.println("Enter the rate of interest: ");
	 double rate=sc.nextDouble();
	 
	 System.out.println("Enter the no.of year: ");
	 int year=sc.nextInt();
	 
	 double simpleInterest=(principle*rate*year)/100;
		System.out.println("Simple Interest :"+simpleInterest); 
	 }
}

