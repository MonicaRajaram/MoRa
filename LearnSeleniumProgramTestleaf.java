package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumProgramTestleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//leaftaps.com/opentaps/control/main
		WebDriverManager.chromedriver().setup();
		ChromeDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("http://leaftaps.com/opentaps/control/main");
		String title = D.getTitle();
		System.out.println(title);
		/*  http://leaftaps.com/opentaps/control/main
username : demosalesmanager
password : crmsfa*/
//WebElement u_name = D.findElement(By.name("USERNAME"));
 		String text = D.findElement(By.xpath("//label[text()='Username']")).getText();
 		System.out.println("tEXT: "+text);
		WebElement u_name = D.findElement(By.xpath("//input[@class='inputLogin'][1]"));
u_name.sendKeys("demosalesmanager");


// WebElement pswd = D.findElement(By.id("password"));
WebElement pswd = D.findElement(By.xpath("//input[@type='password']"));
pswd.sendKeys("crmsfa");


WebElement log_button = D.findElement(By.className("decorativeSubmit"));
log_button.click();

WebElement link_crmsfa = D.findElement(By.linkText("CRM/SFA"));
link_crmsfa.click();
String title1 = D.getTitle();
System.out.println(title1);

WebElement lead_tab = D.findElement(By.linkText("Leads"));
lead_tab.click();

D.findElement(By.linkText("Create Lead")).click();

//createLeadForm_primaryPhoneCountryCode

WebElement countrycode = D.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
countrycode.clear();
countrycode.sendKeys("+91");
//Step12: Enter Company name  createLeadForm_companyName 
D.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf Selenium");
// Step13: Enter FirstName
D.findElement(By.id("createLeadForm_firstName")).sendKeys("Monica");
// Step14: Enter LastName
D.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajaram");

D.findElement(By.name("submitButton")).click();

System.out.println("Title: "+ D.getTitle());
	}

}
