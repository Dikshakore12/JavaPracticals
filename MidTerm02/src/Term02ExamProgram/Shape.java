//uases of abstract method
package Term02ExamProgram;

public abstract class Shape {
	public abstract double area();
}
class Rectangle extends Shape{
	double lenght;
	double width;
public Rectangle(double lenght,double width){
	this.lenght=lenght;
	this.width=width;
}
    public double area() {
		return lenght*width;
		
	}
}
class Circle extends Shape{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
}
class Demo{
	public static void main(String[] args) {
		Shape r1=new Rectangle(12,6);
		System.out.println("Area of Rectangle is: "+r1.area());
		Shape c1=new Circle(3);
		System.out.println("Area of Circle is: "+c1.area());
		}
}

	

