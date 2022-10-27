package frame.org;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameWorks {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Saravanan\\Neww\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		String s=driver.findElement(By.xpath("//b[@id='topic']")).getText();
		System.out.println(s);
		
		
		
	    driver.switchTo().frame("frame3");
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		boolean b=check.isEnabled();
     	System.out.println("is the check box is secected?: "+b);
		
		driver.switchTo().defaultContent();
		
		String s1=driver.findElement(By.xpath("//span[contains(text(),'Not a')]")).getText();
        System.out.println("The Topic is: "+s1);
        
        driver.switchTo().frame("frame2");
		WebElement find=driver.findElement(By.xpath("//select[@id='animals']"));

       Select sk=new Select(find);
       boolean bk=sk.isMultiple();
       System.out.println("options are multiple?: "+bk);
       
       List<WebElement> is=sk.getOptions();
	      for(int j=0; j<1;j++) {
	    	  System.out.println("Total available options:");
	    	  for(int i=0;i<is.size(); i++) {
	    	  WebElement w=is.get(i);
	    	  String h=w.getText();
	    	  System.out.println(h);
	      }
	      }
	
	      sk.selectByIndex(1);
	      WebElement e=is.get(1);
	       String lk= e.getText();
	       System.out.println("selected option name: "+lk);
	       
	       TakesScreenshot ts=(TakesScreenshot)driver;
	      File d= ts.getScreenshotAs(OutputType.FILE);
	       File f=new File("C:\\Users\\User\\Downloads\\babycat.PNG");
	       FileUtils.copyFile(d, f);
	       
	       driver.switchTo().defaultContent();
	       
	       
	       
	       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
