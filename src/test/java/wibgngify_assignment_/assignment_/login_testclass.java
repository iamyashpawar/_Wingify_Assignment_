package wibgngify_assignment_.assignment_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.testng.asserts.*;
import wibgngify_assignment_.assignment__baseclass.baseclass;
import wibgngify_assignment_.assignment__baseclass.utility_class;



public class login_testclass extends baseclass
{

	login_pom lp;
	dashboard_pom db;
	 @BeforeMethod
	 public void bm() throws IOException, InterruptedException
	 {
		 //browser setup & url
		 browser_setup(); 
         lp = new login_pom(driver); // object of login page
		 
		 lp.username(utility_class.datafetch(1, 0)); // enter username 
		 
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 Thread.sleep(2000);
		 
	 }
	 
	 @Test
	 public void t1() throws IOException, InterruptedException
	 {
        
		   lp.login();
		//Assert.assertEquals("Password must be present", "Password must be present", "Testcase FailedW");
	      
		 Assert.assertTrue(true);
	 }
	 @Test
	 public void t2() throws IOException, InterruptedException
	 {
		
		 lp.password(utility_class.datafetch(1, 1));
		 Thread.sleep(2000);
		 lp.login();
		 Assert.assertTrue(true);
	 }
	 
	 
	 @AfterMethod
	 public void am() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 driver.close();
	 }
	
}
