

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public void PostiveCre1() {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l=new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePwd("Welcome@123");
		l.clickLogin();
		
		Home h=new Home(driver);
		h.clickOnLogout();

	}

}
