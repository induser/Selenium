package Reggression
import org.openqa.selenium.WebDriver;
public class VerifyTitle {

    @Test
	public void test123()
	{
	    WebDriver driver =new FirefoxDriver();
		driver.get("http://www.learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
}
