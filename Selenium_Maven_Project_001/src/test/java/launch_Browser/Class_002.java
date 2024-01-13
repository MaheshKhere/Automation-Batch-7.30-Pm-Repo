package launch_Browser;

import org.openqa.selenium.By;

import base_class.Base_class;

public class Class_002 extends Base_class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		navigate("https://www.jiomart.com/");
		
		// locate searchbox
		driver.findElement(By.cssSelector("input.aa-Input.search_input")).sendKeys("oil");
		
		
		
	}

}
