package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base_class.Base_class;

public class SubfolderSS extends Base_class {

	public static void main(String[] args) throws IOException {
		launch_browser("chrome");
		navigate("https://www.amazon.in/");

		String path = System.getProperty("user.dir");
		Date d = new Date();
		String reportfolder = d.toString().replaceAll(":", "-") + "//screenshot";
		String Screenshotfolder = path + "//Reports//" + reportfolder;
		System.out.println(Screenshotfolder);
		File f = new File(Screenshotfolder);
		f.mkdirs();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File target = new File("../07_30_Pm_Batch_Selenium_Maven_Project_/SnapShot/homepage.png");
		//File target = new File(projectpath+"\\SnapShot\\homepage1.png");
		File target = new File(Screenshotfolder+"amazon.png");
		FileHandler.copy(source, target);
		
	}

}
