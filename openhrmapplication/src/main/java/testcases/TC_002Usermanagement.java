package testcases;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commanfunction.commanfunctiondata;
import pageobjetcs.EnjoycourseBDD;
import pageobjetcs.Enrollcourses;
import pageobjetcs.Loginpage;
import pageobjetcs.Workspace;

public class TC_002Usermanagement  extends commanfunctiondata {


	public void login(){
		PageFactory.initElements(driver, Loginpage.class);
		Loginpage.searchgoogle.sendKeys(properties.getProperty("searchgoogle")+Keys.ENTER);
		Loginpage.letccodekoushik.click();
		Loginpage.login.click();
		Loginpage.Email.sendKeys(properties.getProperty("Email"));
		Loginpage.password.sendKeys(properties.getProperty("password"));
		Loginpage.loginbutton.click();
	}

	public void verifytheworkspace() {


		PageFactory.initElements(driver, Workspace.class);
		Workspace.course.click();
	}	
	
     public void verifyenrollcourse() {
     PageFactory.initElements(driver, Enrollcourses.class);
        
        // Perform the enroll courses action
        Enrollcourses.enrollCourses.click();
	}
   
     
     public void linkcucumberurl() {
         PageFactory.initElements(driver, EnjoycourseBDD.class);
            
            // Perform the enroll courses action
            EnjoycourseBDD.Cucumberlink.click();
          EnjoycourseBDD.Cucumberlink.click();

    	} 
     
     
     
     
     
     
     

	@Test
	public void VerifyTC_001Testcase(){
		login();	
		verifytheworkspace();
		verifyenrollcourse();
		linkcucumberurl();
	}
}

	
		
