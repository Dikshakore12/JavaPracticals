package overloading;

public class Apple {
	public int Add(int a,int b) {return a+b;}
	public int Add(int a,int b,int c) {return a+b+c;}
}
 class sum extends Apple{
	public static void main(String[] args) {
	Apple a=new Apple();
	System.out.println("Sum of a and b is:"+a.Add(30, 20));
	System.out.println("Sum of a,b and c is:"+a.Add(2, 4,6));

	}

}
