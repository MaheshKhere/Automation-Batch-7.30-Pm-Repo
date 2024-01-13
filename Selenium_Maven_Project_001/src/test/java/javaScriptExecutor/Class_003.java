package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Class_003 extends Base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shirt");
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		
		takescreenshot("After Click on Search Button");
		
		//Go back
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
		takescreenshot("after redirect to back");
		
		// Go Forward
		js.executeScript("window.history.forward()");
		takescreenshot("after redirect to forward");
	}
}
