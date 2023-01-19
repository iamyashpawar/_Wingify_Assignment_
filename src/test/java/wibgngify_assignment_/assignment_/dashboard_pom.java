package wibgngify_assignment_.assignment_;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class dashboard_pom 
{
	WebDriver driver;
	@FindBy(xpath = "//th[@id=\"amount\"]") private WebElement amt;
	
  	@FindBy(xpath = "//table//tr//td[5]") private WebElement data;
	
	
	
	public dashboard_pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void amount()
	{
		amt.click();
	}
	
	/*public void data()
	{
		for(int i = 1;i<=6;i++)
		{
		@FindBy (xpath = "//table//tr["+i+"]//td[5]");
		}
	}*/
	
	public void get_data() throws InterruptedException
	{
		
    List <WebElement> originalvalue= driver.findElements(By.xpath("//table[@id=\"transactionsTable\"]//tbody"));
		
    int size = originalvalue.size();
			
    String[] actual = new String[size]; 
    String[] sorted = new String[size];
    
    for (int i = 0; i < size; i++) 
    {
       actual[i]=sorted[i] = driver.findElement(By.xpath("//table[@id=\\\"transactionsTable\\\"]//tr["+i+"]//td[5]")).getText();
    }
    Arrays.sort(sorted);
    
	
		
	}
	
}
