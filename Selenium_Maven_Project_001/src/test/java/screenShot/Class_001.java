package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import base_class.Base_class;

public class Class_001 extends Base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate("https://in.linkedin.com/");
		
		//To get root directory
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		// Take Screen Shot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File target = new File("../07_30_Pm_Batch_Selenium_Maven_Project_/SnapShot/homepage.png");
		File target = new File(projectpath+"\\SnapShot\\homepage1.png");
		FileHandler.copy(source, target);
		
		
	}

}
