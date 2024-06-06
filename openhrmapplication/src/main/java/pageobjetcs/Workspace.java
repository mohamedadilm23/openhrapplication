package pageobjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Workspace {

	@FindBy(linkText=("New Course!"))
	public static WebElement course;

}
