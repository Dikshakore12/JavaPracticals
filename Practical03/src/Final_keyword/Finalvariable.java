package Final_keyword;

public class Finalvariable {
	final int speed=250;//variable
	void show() {
		System.out.println("speed limit of car is :"+speed);
	}
	// speed=300;
	//System.out.println(speed);
	public static void main(String[] args) {
		Finalvariable a=new Finalvariable();
		a.show();
	}

}
