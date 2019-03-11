
/************ This code would open the Firefox, open the URL(http://52.172.9.168:5719/addressbook/) where address book application is present.
                  Enters the mandatory fields of the address book and saves the record.
                  Entered record is searched and as soon as it is found the browser gets closed.**********************/


package AddressBook_Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MainClass {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\cc555e\\Desktop\\jenkinstest\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    
            
            //Enter the Application URL         
            driver.get("http://13.71.82.89:5719/addressbook/");
            
            try {
                  Thread.sleep(3000);                 
            } catch (InterruptedException e) {
                  
                  e.printStackTrace();
            }           
            
            driver.manage().window().maximize();
            
            //Wait<WebDriver> wait = new WebDriverWait(driver,10);
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).click();
            
            
            try {
                  Thread.sleep(3000);                 
            } catch (InterruptedException e) {
                  
                  e.printStackTrace();
            }     
            
            
            Actions action1 = new Actions(driver);
            
            action1.sendKeys("testFirstname123").perform();
            
            Actions action2 = new Actions(driver);
            
            action2.sendKeys(Keys.TAB).perform();
            
            Actions action3 = new Actions(driver);
            
            action3.sendKeys("testLastname").perform();
            
            Actions action4 = new Actions(driver);
            
            action4.sendKeys(Keys.TAB).perform();     
            
            Actions action5 = new Actions(driver);
            
            action5.sendKeys("0123456789").perform();
            
            Actions action6 = new Actions(driver);
            
            action6.sendKeys(Keys.TAB).perform();
            
            Actions action7 = new Actions(driver);
            
            action7.sendKeys("testmail@test.com").perform();
            
            Actions action8 = new Actions(driver);
            
            action8.sendKeys(Keys.TAB).perform();
            
            Actions action9 = new Actions(driver);
            
            action9.sendKeys("2/26/19").perform();
            
            try {
                  Thread.sleep(3000);                 
            } catch (InterruptedException e) {
                  
                  e.printStackTrace();
            }     
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
            
            try {
                  Thread.sleep(3000);                 
            } catch (InterruptedException e) {
                  
                  e.printStackTrace();
            }     
            
            
            
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[1]/input")).sendKeys("testmail@test.com");
            
            try {
                  Thread.sleep(3000);                 
            } catch (InterruptedException e) {
                  
                  e.printStackTrace();
            }
            
            Actions action = new Actions(driver);
            
            action.sendKeys(Keys.ENTER).perform();
                          System.out.println("User was added and searched successfully");

                  
                  
            try {
                  Thread.sleep(3000);                 
            } catch (InterruptedException e) {
                  
                  e.printStackTrace();
            }                 
            driver.close();   
      }
      
}
