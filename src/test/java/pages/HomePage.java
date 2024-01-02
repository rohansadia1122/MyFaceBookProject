package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseFB.BaseTest;

public class HomePage extends BaseTest {

	public HomePage(WebDriver ldriver) {
		dr = ldriver;
		PageFactory.initElements(ldriver, this);

	}

	

	public void logIn(String uname, String upass) {

		WebElement uName = dr.findElement(By.name("email"));

		WebElement uPass = dr.findElement(By.name("pass"));
		
		uName.sendKeys(uname);
		uPass.sendKeys(upass);

	}

}
