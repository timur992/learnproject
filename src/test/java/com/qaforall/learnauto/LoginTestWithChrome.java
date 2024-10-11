package com.qaforall.learnauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestWithChrome {
	@Test
	public static void runWithChrome() throws InterruptedException {
		//initialize and instantiate webdriver and all web elements
		
		//Initialize and instantiate a web driver
		WebDriver driver = new ChromeDriver();
		
		
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		Thread.sleep(5000);
		
		//all web elements
		WebElement usernameTextBox = driver.findElement(By.id("username")); 
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
		
		
		//other variables
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		//test steps

		
		usernameTextBox.sendKeys(username);
		Thread.sleep(5000);
		
		passwordTextBox.sendKeys(password);
		Thread.sleep(5000);
		
		loginButton.click();
		Thread.sleep(5000);

		driver.quit();
	}

}
