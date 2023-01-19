package wibgngify_assignment_.assignment_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
  
public class login_pom 
{
	
  @FindBy(xpath ="//input[@id=\"username\"]") private WebElement u_name;
  
  @FindBy(xpath ="//input[@id=\"password\"]") private WebElement password;
  
  @FindBy(xpath ="//button[text()=\"Log In\"]") private WebElement login_button;
	
  public login_pom(WebDriver driver)
  {
	  PageFactory.initElements( driver, this);
  }
  
  public void username(String uname)
  {
	  u_name.sendKeys(uname);
  }
  
  public void password(String pass)
  {
	  password.sendKeys(pass);
  }
  
  public void login()
  {
	  login_button.click();
  }
  
  
}
