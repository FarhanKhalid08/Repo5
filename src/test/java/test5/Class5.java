package test5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class5 {
public static WebDriver driver;

@Test
@Parameters({"url","usernamelocator","username","passwordlocator","password"})
public void Parameters(String url,String usernamelocator,String username,String passwordlocator,String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	driver.findElement(By.cssSelector("a.signin")).click();
	driver.findElement(By.id(usernamelocator)).sendKeys(username);
    driver.findElement(By.id(passwordlocator)).sendKeys(password);
    driver.quit();
}
}
