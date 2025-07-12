package Multiple_Inheritance;
public class Pet {
		public void play() {
			System.out.println("Pet is playing.");
		}
	}
	class Car {
		public void accelerate() {
			System.out.println("Car is accelerating.");
		} }
	class PetVehicle {
		private Pet pet;
		private Car car;
		public PetVehicle() {
			pet = new Pet();
			car = new Car();
		}
		public void play() {
			pet.play();
		}
		public void accelerate() {
			car.accelerate();
		} }
	class TestCustomInheritance {
		public static void main(String[] args) {
			PetVehicle petVehicle = new PetVehicle();
			petVehicle.play(); 
			petVehicle.accelerate(); 
		}
	}



