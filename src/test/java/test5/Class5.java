package test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {
public static WebDriver driver;
public static void main (String[] args) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rediff.com");
	
	driver.findElement(By.cssSelector("a.signin")).click();
	driver.findElement(By.id("login1")).sendKeys("farhankhalid920@hotmail.com");
    driver.findElement(By.id("password")).sendKeys("subhan");
    driver.quit();
}
}
