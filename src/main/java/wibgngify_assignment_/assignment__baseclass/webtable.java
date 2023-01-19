package wibgngify_assignment_.assignment__baseclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dev.failsafe.internal.util.Assert;

public class webtable 
{
	WebDriver driver;
	public void sort() 
	{
    ArrayList<String> actual = new ArrayList<>(); 
	
	List<WebElement> amount_data = driver.findElements(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div"));
	
	for(WebElement a:amount_data){
		actual.add(a.getText());
	}
	
	ArrayList<String> afterclick = new ArrayList<>();   
	
	for(String s:actual){
		afterclick.add(s);
	}
	Collections.sort(afterclick);
	Assert.assertTrue(afterclick.equals(actual));
	
	System.out.println(actual);
	
	
	System.out.println(afterclick);
	
	
	
	}
}
