package java_pakacge;

public class Water {
 int States() {return 0;}
}
class Solid extends Water{
	 int States() {return -10;}
}
class Liquid extends Water{
	int States() {return 35;}
}
class Gases extends Water{
	int States() {return 100;}
}
class waterTesting{
    public static void main(String[] args) {
		Water a=new Solid();
		
		System.out.println("The temperature of Solid state in degree celsius is:"+a.States());
		
		a=new Liquid();
		System.out.println("The temperature of Liquid state in degree celsius is:"+a.States());
		
		a=new Gases();
		System.out.println("The temperature of Gases state in degree celsius is:"+a.States());
	
	}
}
