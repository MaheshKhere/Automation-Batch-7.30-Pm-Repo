package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class HashSet_001 {

	public static void main(String[] args) {
		
		HashSet<Float> cd = new HashSet<Float>();
		
		// To add values from 100 to 120 
		for(float f= 100.00f; f<=120.00f; f++ ) {
			cd.add(f);
		}
		
		// To print all values 
		System.out.println(cd);
		
		//To remove value
		//cd.remove(100.0f);
		System.out.println(cd);
		
		//To search any value
		System.out.println(cd.contains(111.0f));
		
		// Create copy of hashset
	     System.out.println(cd.clone());
		
		//To remove all values
		//cd.clear();
		//System.out.println(cd);
		
		//To Print all values using iterator
		Iterator<Float> i = cd.iterator();
		 while(i.hasNext()) {
			 System.out.print(i.next()+"  ");
			 
		 }
		 

	}

}
