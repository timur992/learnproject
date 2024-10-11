package com.qaforall.learnauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestsWithParameters {
	
	@Test
	@Parameters({"username", "password"})
	public void loginTest(String username, String password) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		Thread.sleep(2000);
		
		//all web elements
		WebElement usernameTextBox = driver.findElement(By.id("username")); 
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));

		usernameTextBox.sendKeys(username);
		Thread.sleep(2000);
		
		passwordTextBox.sendKeys(password);
		Thread.sleep(2000);
		
		loginButton.click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
