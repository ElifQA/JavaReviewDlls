package com.Review10Interface;

public class TestInterface {
	public static void main(String[] args) {
		
	
	ChromeDriver driver1 =new ChromeDriver();
	
	driver1.openBrowser();
	driver1.closeBrowser();
	driver1.maximizeWindow();
	driver1.findElement();
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.openBrowser();
	driver.closeBrowser();
	driver.maximizeWindow();
	driver.findElement();
	}
}
