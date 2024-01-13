package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_002 {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		LinkedList<String> h= new LinkedList<String>();
		
		
		s.add("Pratiksha");
		s.add("Vaishanvi");
		s.add("Vaibhav");
		s.add("Pooja");
		s.add(4, "Vitrag");
		s.add("diksha");
		s.add("Jyoti");
		s.add(7, "ab");
		
		System.out.println(s);
		
		System.out.println(s.get(5));
		System.out.println(s.contains("pooja"));
		
	}

}
