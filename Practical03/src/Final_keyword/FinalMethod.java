package Final_keyword;

public class FinalMethod {//class
	final void output() {//method
		System.out.println("This is the method using Fianl keyword");
	}
}
class Search extends FinalMethod{
	//void output(){
	//System.out.println("Search");
	//}
	public static void main(String[] args) {
		Search s=new Search();
		s.output();
	}
}	
