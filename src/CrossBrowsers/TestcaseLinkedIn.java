package CrossBrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
class TestcaseLinkedIn 
{
	@Test
	public  void Test()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
	    driver.findElement(By.id("login-email")).sendKeys("kalaiselvi.d@mstsolutions.com");
	    driver.findElement(By.id("login-password")).sendKeys("Kalai1893");
	    driver.findElement(By.id("login-submit")).submit();
	    driver.findElement(By.linkText("Update your profile")).click();
	    String username=driver.findElement(By.cssSelector(".pv-top-card-section__information mt3 h1.pv-top-card-section__name Sans-26px-black-85% mb1")).getText();   
	    System.out.println(username);//driver.findElement(By.xpath("html/body/nav/div/ul[1]/li[6]/div/button")).click();
	    //driver.findElement(By.xpath(".//*[@id='ember8514']/span[2]/h3")).click();
	   
	    //driver.findElement(By.xpath("html/body/nav/div/ul[1]/li[6]/div/ul/li[2]/ul/li[1]/a")).click();
	    
	    //driver.findElement(By.id("basics-link")).click();
	    //driver.findElement(By.cssSelector(".settings-grid ul.list li#setting-edit-basic a.expander span.indicator")).click();
	    
	    //driver.findElement(By.partialLinkText("Name, location, and industry")).click();
	    //driver.findElement(By.cssSelector("#setting-edit-basic a.expander h3.heading p.sub-heading span.indicator")).click();
	    //driver.get("https://www.linkedin.com/profile/edit-basic-info");
	    //driver.findElement(By.xpath(".//*[@id='setting-edit-basic']/a/h3")).click();
	    /*if(username=="Kalai Selvi Dharmalingam")
	    {
	    System.out.println("Test Passed");
	 	 }
	    else
	    {
	    	System.out.println("Test Failed");
	    }*/
	    }

}
