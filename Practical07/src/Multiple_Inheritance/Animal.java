package Multiple_Inheritance;

public class Animal {
		public void eat() {
			System.out.println("Animal is eating.");
		}

	}
	class Vehicle {//using interface
		public void drive() {
			System.out.println("Vehicle is being driven.");
		}
	}
	class AnimalVehicle {
		private Animal animal;
		private Vehicle vehicle;
		
		public AnimalVehicle() {
			animal = new Animal();
			vehicle = new Vehicle();
		}
		public void eat() {
			animal.eat();
			
		}
		public void drive() {
			vehicle.drive();
		}
	}
	class testMultipleInheritance{
		public static void main(String[] args) {
			AnimalVehicle animalVehicle = new AnimalVehicle();
			animalVehicle.eat(); // output : Animal is eating.
			animalVehicle.drive(); //Output : Vehicle is being driven.
		}
	}


