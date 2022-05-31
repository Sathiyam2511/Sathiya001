package org.sele;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;	

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHYA\\Desktop\\Ellicpse\\Sathiya001\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame2");
		
        
		WebElement drag = driver.findElement(By.xpath("//b[text()='Animals :']"));
		String text = drag.getText();
		System.out.println(text);
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s = new Select(drop);
		s.selectByIndex(1);
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement draganddrop = options.get(i);
			String text1 = draganddrop.getText();
			System.out.println(text1);
			
		}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
			
	}

}
