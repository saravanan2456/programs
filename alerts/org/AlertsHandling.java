package alerts.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsHandling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Saravanan\\Neww\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Simple alert
	    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert a=driver.switchTo().alert();
		 Thread.sleep(3000);
		a.accept();
		
		//Confirm alert
	    //driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
       // a.accept();
	    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Thread.sleep(3000);
	    a.dismiss();
	     String kl=  driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
	     System.out.println("your option in Confort Alert: "+kl);
	    Thread.sleep(3000);
	    
	  // Prompt alert
	    WebElement values= driver.findElement(By.xpath("//button[@id='promtButton']"));
	    values.click();
	     a.sendKeys("SELENIUM");
	    
	   
         Thread.sleep(5000);
         a.accept();
         
	     String k2=  driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
	     System.out.println("You Entered Name in promot option: "+k2);

		
		
		
		
		
		
	}

}
