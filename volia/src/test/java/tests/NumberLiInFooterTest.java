package tests;

import org.junit.Assert;
import org.junit.Test;

import pages.VoliaHomePage;

public class NumberLiInFooterTest extends BaseTest {

	@Test
	public void numberLiInFooter() {
		
	driver.get("https://volia.com/");
	
	VoliaHomePage homePage = new VoliaHomePage(driver);
	
	int expNumberLinks = 7;
	int actNumberLinks = homePage.numberb2bFooterHomePage();
	
	
	Assert.assertTrue("Fail. Expected the number links in the block Для бізнесу - " +
	expNumberLinks + ". Actual the number links - " + actNumberLinks, 
	expNumberLinks == actNumberLinks);
	}
}
