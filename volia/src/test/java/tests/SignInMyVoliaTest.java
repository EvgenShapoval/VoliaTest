package tests;

import org.junit.Assert;
import org.junit.Test;

import pages.ErrorMyVoliaPage;
import pages.SignInMyVoliaPage;
import pages.VoliaHomePage;

public class SignInMyVoliaTest extends BaseTest {

	@Test
	public void dropdownClubTest() {
		driver.get("https://volia.com/");
		
		VoliaHomePage homePage = new VoliaHomePage(driver);
		
		homePage.clickSignInMyVoliaPage();

		
		SignInMyVoliaPage signIn = new SignInMyVoliaPage(driver);
	
		signIn.inputUsernameSignInMyVoliaPage("23423424");
		signIn.inputPasswordSignInMyVoliaPage("55555");
		signIn.clickAFormSignInMyVoliaPage();
		signIn.clickSubmitSignInMyVoliaPage();

		
		ErrorMyVoliaPage errorMyVolia = new ErrorMyVoliaPage(driver);
		
		String expectedError = "Дані не збіглися";
		String actualError = errorMyVolia.actualErrorMyVoliaPage();

		
		Assert.assertTrue("Fail. Ожидали сообщение - " + expectedError + ". Было получено сообщение - "
				+ actualError, actualError.contains(expectedError));
	}
}
