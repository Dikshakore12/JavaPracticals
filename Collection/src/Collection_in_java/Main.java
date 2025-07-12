package Collection_in_java;
import java.util.HashSet;
public class Main {
	 public static void main(String[] args) {
	        // Create a HashSet to store the names of the first four months
	        HashSet<String> months = new HashSet<>();

	        // Add the names of the first four months to the HashSet
	        months.add("January");
	        months.add("February");
	        months.add("March");
	        months.add("April");

	        // Print the names of the months
	        for (String month : months) {
	            System.out.println(month);
	        }
	    }
	}



