package task.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraveenTask {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Saravanan\\SeleniumTrail\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close=driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		
		WebElement send=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		send.sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	Thread.sleep(5000);
    	
       driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
      	Thread.sleep(3000);
      	
       String parant=driver.getWindowHandle();
    	driver.switchTo().window(parant);
    	
    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
    	Thread.sleep(3000);
	    driver.switchTo().window(parant);

    	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
    	Thread.sleep(3000);
    	
    	Set<String> st=driver.getWindowHandles();
    	List<String> l=new ArrayList<>(st);
    	List<String> l1=new ArrayList<>();
    
		System.out.println("Total stored elements:");

       	for(String x:l) {
    		if(!parant.equals(x)) {
        		driver.switchTo().window(x);
            	Thread.sleep(5000);
             WebElement mob=driver.findElement(By.xpath("//span[contains(@class,'B_NuCI')]"));
    		String sd=mob.getText();
    		System.out.println(sd);
    		l1.add(sd);
        	Thread.sleep(2000);
            driver.close();
    		}
    	}
    	Thread.sleep(5000);
        String get3=l1.get(1);
    	
           System.out.println(" ");
           System.out.println("3rd elements validation:");
           System.out.println("Required model Name:");
       
           String lk="            POCO X2 ( NavyBlue, 64 GB)  (4 GB RAM)";
           System.out.println(lk);
       	Thread.sleep(5000);


    	if(lk.equals(get3)) {
    		System.out.println("Matched: "+get3);
    	}else {
    		System.err.println("Mismatched: "+get3);
    	}
            	
    		

		
		
		
	}

}
