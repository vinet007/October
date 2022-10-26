package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//serachTab
		WebElement searchTab = driver.findElement(By.id("twotabsearchtextbox"));
		searchTab.sendKeys("iphone 13 pro" , Keys.ENTER);
		
		//results
		//WebElement result = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
		
		
		List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			
		for(WebElement product : products) {
			 System.out.println(product.getText());
		}

		
}
}
