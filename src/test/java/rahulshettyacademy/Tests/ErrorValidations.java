package rahulshettyacademy.Tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.TestComponents.Retry;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidations extends BaseTest {
	
	@Test(groups= {"ErrorHandling"}, retryAnalyzer=Retry.class)
	public void IncorrectPassword() throws IOException {
	
		landingPage.loginApplication("nidhipradeepsheeba@gmail.com", "Nii@19");
		Assert.assertEquals("Incorrect email password.", landingPage.getErrorMessage());
	}
 
	
	@Test
	public void IncorrectEmail() throws IOException {
	
		landingPage.loginApplication("nidhi@gmail.com", "Nidhii@19");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
	}
}
