package screenShot;

import org.openqa.selenium.By;

import base_class.Base_class;

public class Class_003 extends Base_class {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobile");
		takescreenshot("After Send text");
		
		// Click on button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        takescreenshot("After Click search Button");

        System.out.println(projectpath);
	}

}
