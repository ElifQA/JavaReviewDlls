package com.Review10Interface;

public class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("open firefox browser");
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("close firefox browser");
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("maximize firefox browser");
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("findelement firefox browser");
	}

}
