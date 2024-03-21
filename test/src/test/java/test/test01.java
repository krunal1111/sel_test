package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		
//		driver.manage().window().maximize();
		
		System.out.println("zooming");
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
////		((JavascriptExecutor) driver).executeScript("document.body.style.zoom = '-50'");
//		jse.executeScript("document.body.style.zoom = '-1000'");
//		
		//zoom in
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("document.body.style.zoom = '-1'");
		
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
//		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();
//
//		 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button")).click();
		 
		 driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
