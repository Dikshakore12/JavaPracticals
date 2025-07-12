package Collection_in_java;

import java.util.ArrayList;
public class Arraylist {

	    public static void main(String[] args) {
	        // Create an ArrayList to store the names of the first four months
	        ArrayList<String> months = new ArrayList<>();

	        // Add the names of the first four months to the ArrayList
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



