package Term02ExamProgram;
//Calculate Attendance of Students
public class Student {
	int rollNo;
    String name;
public Student(int rollNo,String name) {
	this.rollNo=rollNo;
	this.name=name;
}
}
class Attendance extends Student{
	int presentDay;
	public Attendance(int rollNo,String name,int presentDay) {
		super(rollNo,name);
		this.presentDay=presentDay;
	}
	double calculateAttendance() {
		
	return (double) presentDay/180*100;
}
class Test{
	public static void main(String[] args) {
		Attendance student1=new Attendance(1,"Diksha",170);
		Attendance student2=new Attendance(2,"Ankita",160);
		
		System.out.println("Average Attendance for "+student1.name+":"+student1.calculateAttendance()+"%");
		System.out.println("Average Attendance for "+student2.name+":"+student2.calculateAttendance()+"%");
		
	}
}
}