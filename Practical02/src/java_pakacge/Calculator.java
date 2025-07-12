package java_pakacge;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
    public double sub(double a,double b) {
    	return a-b;
    }
public static void main(String[] args) {
	Calculator c=new Calculator();
	int d1=c.add(22, 33);
	System.out.println("Sum of a and b is:"+d1);
	double d2=c.sub(2.5,1.5);
	System.out.println("substraction of a and b is:"+d2);
	
}
}

