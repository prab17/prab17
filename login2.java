package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class login2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		String appurl="https://alpha.app.oneairclub.com/app/sign-in";
		d.get(appurl);
		d.manage().window().maximize();
		WebElement uname = d.findElement(By.xpath("//input[@type='email']"));
		uname.clear();
		uname.sendKeys("gomathitest6@yopmail.com");
		//Thread.sleep(1000);
		WebElement pwd = d.findElement(By.xpath("//input[@type='password']"));
		pwd.clear();
		pwd.sendKeys("123456789");
		//Thread.sleep(1000);
		WebElement sbtn=d.findElement(By.xpath("//button[@type='submit']"));
		sbtn.click();
		//d.close();
		System.out.println("Test script executed successfully");
		//System.exit(0);
		
	}

}
