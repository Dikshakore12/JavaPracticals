package Abtraction;

public abstract class Bird {
		 Bird(){
			  System.out.println("Bird fly high"); 
		   }
		   abstract void fly();
		   void Changecolor() {
			   System.out.println("Clour of Bird is Green");
		   }
		}
		class Peacock extends Bird{
			void fly() {
				System.out.println("Flying safely..");
				}
		}
		class AbtractKore{
			public static void main(String[] args) {
				Bird obj = new Peacock();
				obj.fly();
				obj.Changecolor();
				
			}
		}


