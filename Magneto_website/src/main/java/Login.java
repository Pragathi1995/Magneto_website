

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	By email=By.id("email");
	By pass=By.id("pass");
	By login=By.id("send2");
	public void typeEmail(String un) {
		driver.findElement(email).sendKeys(un);
	}
	public void typePwd(String pw) {
		driver.findElement(pass).sendKeys(pw);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}

}
