package windowshandle.org;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Saravanan\\Neww\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	 
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(5000);
		 
        WebElement select=driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[1]"));
		select.click();
		
		String s=driver.getWindowHandle();
		System.out.println("Parent ID: "+s);
		Thread.sleep(5000);
	
//       Set<String>k=driver.getWindowHandles();
//		for(String x:k) {
//			if(!s.equals(x)) {
//				System.out.println("Child ID: "+x);
//	    		Thread.sleep(5000);
//          }
//	}
	    driver.switchTo().window(s);
    	WebElement select2=driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[2]"));
    	select2.click();
    	Thread.sleep(3000);
        driver.switchTo().window(s);
    	WebElement select3=driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[3]"));
    	select3.click();
    	Thread.sleep(3000);
    	driver.switchTo().window(s);
    	WebElement select4=driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[4]"));
    	select4.click();
    	Thread.sleep(3000);
    	
    	Set<String>k1=driver.getWindowHandles();
        List<String> l=new ArrayList<>(k1); 
        driver.switchTo().window(l.get(1));
    	Thread.sleep(5000);
        driver.switchTo().window(l.get(2));
    	Thread.sleep(5000);
        driver.switchTo().window(l.get(3));
    	Thread.sleep(5000);

      for(String z:l) {
        	if(!z.equals(s)) {
        		driver.switchTo().window(z);
            	Thread.sleep(5000);
            	String kj=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
            	String op=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
                System.out.println(" ");
            	System.out.println("Model name: "+kj);
            	System.out.println("Price: "+op);
                driver.close();

        	}
        	
        }

		
		
		
		
	}

}
