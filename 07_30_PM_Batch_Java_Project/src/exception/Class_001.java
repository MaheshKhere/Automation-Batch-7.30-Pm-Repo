package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_001 {

	public static void main(String[] args) throws Exception  {
		System.out.println("");
		
		
		
		
		// Customized Exception
		System.out.println("hiii");
		Thread.sleep(2000);
		throw new InterruptedException("Thread.sleep throw exception");

	}

}
