package tests;

import org.junit.Assert;
import org.junit.Test;

import helpers.WebLibrary;
import pages.DataCenterPage;
import pages.VoliaHomePage;

public class StingIntoIntTest extends BaseTest {

	@Test
	public void dropdownClubTest() {
		driver.get("https://volia.com/");
		
		int expServerPrice = 199;
		
		VoliaHomePage homePage = new VoliaHomePage(driver);
		
		homePage.clickdataCenterPage();

		
		DataCenterPage dataCPage = new DataCenterPage(driver);
	
		String textPrice = dataCPage.serverPriceString();
		System.out.println("Server Price in DC Page (String) - " + textPrice);
		
		int modServerPrice = WebLibrary.cutStingReturnInt(textPrice, 4, 7);
		System.out.println("Server Price in DC Page (Int) - " + modServerPrice);

		
		Assert.assertTrue("Fail. Цена сервера на сайте - " + textPrice + ". Не равна - "
				+ expServerPrice, modServerPrice == expServerPrice);
		
	}
}
