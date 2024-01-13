package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	// public static global WebDriver reference
	public static WebDriver driver;

	// declare public static global Properties reference
	public static Properties prop;

	// create Constructor
	public BaseClass() {
		// check file is present or not
		File f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\ConfigurationLayer\\config.properties");
		try {
			// read the file content
			FileInputStream fis = new FileInputStream(f);

			// create object of Properties class
			prop = new Properties();

			// load the property file in current script
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// create static initialization() method
	public static void initialization() {
		// connect to the actual browser
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		// Up casting
		driver = new ChromeDriver(opt);

		// maximize browser
		driver.manage().window().maximize();
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// pageLoadTimeOut code
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// delete all cookies
		driver.manage().deleteAllCookies();

		// get the URLfrom properties file
		String url = prop.getProperty("url");

		// open a url
		driver.get(url);
	}

}
