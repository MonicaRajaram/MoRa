package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver drive = new ChromeDriver();
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
drive.get("https://github.com/");

String title = drive.getTitle();
WebElement lead_tab = drive.findElement(By.linkText("Learn more"));
lead_tab.click();
System.out.println(title);
drive.close();

	}

}
