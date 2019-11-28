package org.jenkins.integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsInt {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa.micromedexsolutions.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("login.username_index_0")).sendKeys("702180001");
		driver.findElement(By.id("login.password_index_0")).sendKeys("702180001");
		driver.findElement(By.id("Submit")).click();
		
		
		
		
	}

}
