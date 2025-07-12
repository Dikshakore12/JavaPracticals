package overriding;

public class Vehicle {
	public void show() {
		System.out.println("This is the bike");
	}	
	}
class car extends Vehicle{
	public void show() {
		System.out.println("This is the car");
		
	}
}
class Output extends car{
	public static void main(String[] args) {
		car obj=new car();
		obj.show();
	}
}