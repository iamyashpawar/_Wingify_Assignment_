package wibgngify_assignment_.assignment_;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import wibgngify_assignment_.assignment__baseclass.baseclass;
import wibgngify_assignment_.assignment__baseclass.utility_class;
import wibgngify_assignment_.assignment__baseclass.webtable;

public class webtable_testclass extends baseclass
{
	webtable wt;
	login_pom lp2;
   @BeforeMethod
   public void d() throws IOException, InterruptedException
   {
	   browser_setup();
	   lp2.username(utility_class.datafetch(1, 0));
	   Thread.sleep(2000);
	   lp2.password(utility_class.datafetch(1, 1));
   }
   @Test
   public void t3()
   {
	   wt.sort();
	   Assert.assertTrue(true);
   }
   
   @AfterMethod
   public void am()
   {
	   driver.close();
   }
	
}
