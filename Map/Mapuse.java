package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mapuse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Saravanan\\Neww\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	 
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(5000);
		
		WebElement rel=driver.findElement(By.xpath("//div[@class='_10UF8M'][4]"));
		boolean k=rel.isEnabled();
		
		if(k==true) {
			System.out.println("Relevance option is selected");
		}else {
			System.out.println("Relevance option not selected");
		}
		System.out.println("---------------------------------");   
		
		
		        Map<String,String> m=new HashMap<String,String>();
	
		 List<WebElement> name=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> price=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

//		   for(WebElement aa:name) {      
//		     String kk=aa.getText();
//			    for(WebElement bb:price) {
//			       String ll=bb.getText();  //In this for loop all values added in 
//			       m.put(kk, ll);             single key.. this is not ok.
//			   }	
//		    }
		 
		 for(int i=0; i<name.size();i++) {
				WebElement nw=name.get(i);
	        	String kk=nw.getText();     // This method one for loop enough
	        	WebElement pw=price.get(i);
        		String vv=pw.getText();
         		m.put(kk, vv);
			 }
		 
//		 for(int i=0; i<name.size();i++) {
//		    WebElement nw=name.get(i);
//		      String kk=nw.getText();
//		   for(int j=0;j<price.size(); j++) {   //This method ok..But two for loop
//		    WebElement pw=price.get(i);           needed
//		       String vv=pw.getText();
//		       m.put(kk, vv);
//		      }
//		   }
		        
		        int i=m.size();
		    System.out.println("Total no.of Mobiles: "+i);
		    
			    Set<Entry<String, String>> set=m.entrySet();
			         for(Entry<String, String>x:set) {
				            System.out.println(" ");
				            System.out.println(x);
                   }
		
		
		
		
		
		
	}
	

}
