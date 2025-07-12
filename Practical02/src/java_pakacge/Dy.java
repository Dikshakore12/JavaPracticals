package java_pakacge;

public class Dy {
	public static int add(int a,int b) {
		return a+b;
	}
	public static double sub (double a, double b) {
		return a-b;
	}
	public static void main(String args[]) {
		Dy s=new Dy();
		
		int d1=s.add(24,36);
		System.out.println("addition: "+d1);
		
		 double d2=s.sub(93,72 );
		 System.out.println("subtraction: "+d2);
		 
		 
	}

}
