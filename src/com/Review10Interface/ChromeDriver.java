package com.Review10Interface;

public class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("open chrome browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close chrome browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("maximize chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("findelement");
		
	}
	

}
