package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdownLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");

WebElement dropElement = driver.findElement(By.id("dropdown1"));
Select drop1 =new Select(dropElement);
drop1.selectByIndex(1);

WebElement webElemstt = driver.findElement(By.name("dropdown2"));
Select drop2 =new Select(webElemstt);
drop2.selectByVisibleText("Loadrunner");

WebElement dropelement2 = driver.findElement(By.name("dropdown3"));
Select drop3 =new Select(dropelement2);
drop3.selectByValue("3");





	}

}
