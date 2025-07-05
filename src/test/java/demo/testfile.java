package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testfile {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 	 
		 if(driver.getCurrentUrl() .equalsIgnoreCase("https://www.amazon.in/")) 
		 {
			 System.out.println("Verified");
			 Thread.sleep(3000);
		 }else 
		 {
			 System.out.println("Not verified");
		 }
		 
		 
		 driver.close();
	}
}
