package Collection_in_java;

import java.util.ArrayList;
import java.util.Iterator;

public class Listiterator {
	
	    public static void main(String[] args) {
	        // Create an ArrayList to store the names of the first four months
	        ArrayList<String> months = new ArrayList<>();

	        // Add the names of the first four months to the ArrayList
	        months.add("January");
	        months.add("February");
	        months.add("March");
	        months.add("April");

	        // Get the iterator for the ArrayList
	        Iterator<String> iterator = months.iterator();

	        // Traverse the ArrayList using the iterator
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


