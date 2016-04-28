package com.geeksforless.webdriver.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleTestWithLoop {

	public static void main(String[] args) {
		System.out.println("opening firefox...");
		WebDriver driver = new FirefoxDriver();
		
		// Открываем браузер и переходим на указанную страницу
		driver.get("http://www.google.com.ua/webhp?complete=1&hl=ru");
		String[] searchStrings 		= {"тестирование", "автоматизация", "проверка №3", "финальная проверка"};
		
		WebElement searchTextField 	= driver.findElement(By.name("q"));
		WebElement searchButton 	= driver.findElement(By.name("btnG"));
        
		
		for (int i = 0; i < 4; i++) {
			// Очищаем поле ввода
			searchTextField.clear();
			
			// Вводим текст в строку поиска
			searchTextField.sendKeys(searchStrings[i]);
			System.out.println("searchStrings[i] == " + searchStrings[i]);
			
			// Нажимаем на кнопку поиска
			searchButton.click();
			
			// Задержка на 2 секунды
			try {
			    Thread.sleep(2000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		
		// Закрываем окно браузера
		driver.close();
	}
}
