package org.hp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailt\\SeleniumMaven\\MavenOne\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphoneX");
		Thread.sleep(3000);
		WebElement btnclick = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		btnclick.click();

		//driver.quit();
	}

}
