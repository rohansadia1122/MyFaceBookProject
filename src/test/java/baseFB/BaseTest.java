package baseFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static WebDriver dr;

	public void setupDriver() {

		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();

	}

	public void quitDriver() throws InterruptedException {

		if (dr != null) {
			Thread.sleep(2000);
			dr.quit();

		}

	}

}
