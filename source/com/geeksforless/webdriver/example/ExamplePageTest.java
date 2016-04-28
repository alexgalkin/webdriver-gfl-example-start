package com.geeksforless.webdriver.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExamplePageTest {

	public static void main(String[] args) {
		System.out.println("opening firefox...");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.ua/webhp?complete=1&hl=ru");
		
		WebElement searchTextField 	= driver.findElement(By.name("q"));
		WebElement searchButton 	= driver.findElement(By.name("btnG"));
        
		// Вводим текст в строку поиска
		searchTextField.sendKeys("тестирование с помощью WebDriver");
        
        // Нажимаем на кнопку поиска
		searchButton.click();
	}

}
