package New_Packages;

import New_Packages.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
	
	WebDriver driver;

    By user99GuruName = By.name("uid");

    By password99Guru = By.name("password");

    By titleText =By.className("barone");

    By login = By.name("btnLogin");

    public Login(WebDriver driver){

        this.driver = driver;}

	
	
	
	
	

}
