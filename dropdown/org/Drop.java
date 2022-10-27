package dropdown.org;

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

public class Drop {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Saravanan\\Neww\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement dr=driver.findElement(By.xpath("//select[@id='first']"));
		Select s= new Select(dr);
		boolean b=s.isMultiple();
		System.out.println("the option is multiple: "+b);
		System.out.println("    ");
		
	     //s.selectByIndex(2);
		//s.selectByValue("Microsoft");
		//s.selectByVisibleText("Yahoo");
		
		List<WebElement>kl=s.getOptions();
		for(int j=0; j<1; j++) {
			System.out.println("Total available single options:");
               for(int i=0; i<kl.size(); i++) {
			    WebElement ele=kl.get(i);
			    System.out.println(ele.getText());
               }
		}
		
		for (int j=0; j<1;j++) {
	    	 System.out.println("To Selected value from single option:");
	    	 for(int i=0; i<kl.size();i++) {
			  WebElement si=kl.get(i);
		      String o=si.getText();
			  if(o.equals("Google")) {
				System.out.println(si.getText());
				s.selectByVisibleText("Google");
			}
		}
		}
		System.out.println("  ");
		
		WebElement multi=driver.findElement(By.xpath("//select[@id='second']"));
	    Select mt=new Select(multi);
	    boolean b1=mt.isMultiple();
	    System.out.println("The option is multiple:"+b1);
	    System.out.println(" ");
	    mt.selectByIndex(0);
	    mt.selectByIndex(1);
	    mt.selectByIndex(2);
	    
	    System.out.println("Total available Multivalue dropdown option");
		
	    List<WebElement> all=mt.getAllSelectedOptions();
	    
	    	for(int i=0; i<all.size();i++) {
	    	WebElement u=all.get(i);
	    	System.out.println(u.getText());
	    }
	    
	    mt.deselectByIndex(1);
	    System.out.println(" ");
        System.out.println("to find first selected options");
	    WebElement first=mt.getFirstSelectedOption();
	    System.out.println(first.getText());

	    //TakesScreenshot ts=(TakesScreenshot) driver;
	    // File fil=ts.getScreenshotAs(OutputType.FILE);
	    // File path= new File("C:\\Users\\User\\Downloads\\task1.PNG");
	    // FileUtils.copyFile(fil, path);
		
		}

}
