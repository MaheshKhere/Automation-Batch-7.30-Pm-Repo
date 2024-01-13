package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Finally_block {

	public static void main(String[] args) {
		System.out.println("hiii");
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally Block");
		}
	}

}
