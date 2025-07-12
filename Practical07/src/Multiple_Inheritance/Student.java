package Multiple_Inheritance;

public class Student {
		public void Num() {
			System.out.println("100 Students present in one Class");
		}

	}
	class Faculty {
		public void Num2() {
			System.out.println("10 Teachers teach in a college.");
		}
	}
	class StudentFaculty{
		private Student study;
		private Faculty teach;
		
		public StudentFaculty() {
			study = new Student();
			teach = new Faculty();
		}
		public void Num() {
			study.Num();
			
		}
		public void Num2() {
			teach.Num2();
		}
	}
	class testMultipleInheritance12{
		public static void main(String[] args) {
			StudentFaculty studentfaculty = new StudentFaculty();
			studentfaculty.Num(); 
			studentfaculty.Num2(); 
		}
	}

