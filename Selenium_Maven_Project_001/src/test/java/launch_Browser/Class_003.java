package launch_Browser;

import org.openqa.selenium.By;

import base_class.Base_class;

public class Class_003 extends Base_class{

	public static void main(String[] args) {
		launch_browser("chrome");
		navigate("https://www.flipkart.com/");
		
		// Locate Search Box
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Mobile");
		
		// Click on button
		driver.findElement(By.cssSelector("button._2iLD__")).click();

	    //Click on Logo
		driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
	
	
	}

}
