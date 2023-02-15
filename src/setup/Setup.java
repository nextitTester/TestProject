package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Setup {


	public static WebDriver launchBrowser(String url, String browser){

		WebDriver driver = null;
		try {

			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "edge":
				System.setProperty("webdriver.edge.driver","C:\\drivers\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver","C:\\drivers\\IEWebDriver.exe");
				driver = new InternetExplorerDriver();
				break;
			case "opera":
				//System.setProperty("webdriver.opera.driver","C:\\drivers\\operadriver.exe");
				//driver = new OperaDriver();
			default:
				System.out.println("The mentioned browser type is not defined!");
				break;
			}
			driver.get(url);
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;

	}

}
