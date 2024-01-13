package base_class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_class {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");

	// dynamic code for launch Browser
	public static void launch_browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("Launched Browser is:- " + browser);

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Launched Browser is:- " + browser);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println("Launched Browser is:- " + browser);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	// Dynamic Code for Navigate Url
	public static void navigate(String url) {
		driver.get(url);
		System.out.println("Navigate Url is:- " + url);
		System.out.println("Title of WebPage is:-"+driver.getTitle());
	}

	// Dynamic Code for ScreenShot
	public static void takescreenshot(String screenshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(projectpath + "\\Snapshot\\" + screenshotname + ".png");
		FileHandler.copy(src, trg);

	}
}
