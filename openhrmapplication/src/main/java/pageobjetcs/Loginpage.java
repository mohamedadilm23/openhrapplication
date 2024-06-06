package pageobjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(id="APjFqb")
	public static WebElement searchgoogle;
	
	@FindBy(xpath = "(//h3[contains(@class,'LC20lb MBeuO')])[1]")
	public static WebElement letccodekoushik;
	
	@FindBy(linkText = "Log in")
	public static WebElement login;
	
	@FindBy(name = "email")
	public static WebElement Email;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "//button[.='LOGIN']")
	public static WebElement loginbutton;

	public static void login() {
		// TODO Auto-generated method stub
		
	}

}
