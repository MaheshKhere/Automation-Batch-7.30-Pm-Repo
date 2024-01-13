package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base_class.Base_class;

public class Class_002 extends Base_class {

	public static void main(String[] args) throws Exception {
	launch_browser("firefox");
	navigate("https://www.amazon.in/");
	
	// Send data in textbox
	driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobile");
	
	String projectpath = System.getProperty("user.dir");

	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(projectpath+"\\SnapShot\\AmazonHomepage1.png");
	FileHandler.copy(source, target);
	
	
	// Click on button
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	TakesScreenshot ts1 = (TakesScreenshot) driver;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	File target1 = new File(projectpath+"\\SnapShot\\After Click on Search Button.png");
	FileHandler.copy(source1, target1);
	
	
	}

}
