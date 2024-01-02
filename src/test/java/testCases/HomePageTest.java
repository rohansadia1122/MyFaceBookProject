package testCases;

import baseFB.BaseTest;
import pages.HomePage;

public class HomePageTest extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
		
		BaseTest obj = new BaseTest();
		HomePage obj1 = new HomePage(dr);
		
		
		obj.setupDriver();
		
		obj1.logIn("kamrul@gmail.com", "dflsfslf");
		obj.quitDriver();
		System.out.println("Driver Quite");

		
	}

}
