package CrossBrowsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SFLogin {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.name("username")).sendKeys("kalaiselvi.dsf@mstsolutions.com");
		driver.findElement(By.name("pw")).sendKeys("Kalai*selvi1");
		//String tagname=driver.findElement(By.name("pw")).getTagName();
	    //System.out.println(tagname);
		driver.findElement(By.name("Login")).click();
		driver.navigate().to("https://ap4.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom");

	}

}
