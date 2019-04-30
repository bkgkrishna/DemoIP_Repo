package testScripts;

import baseTest.BaseTest;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Guru99_HomePage;

public class HomeTest extends BaseTest {

    @Test(priority=1)
    public void verifyHomePageTitle()
    {
        String expectedTitle="Guru99 Bank HomePage";
        String actualTitle=driver.getTitle();
        Allure.addDescription("Expected Title: "+expectedTitle);
        Allure.addDescription("Actual Title: "+actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(priority = 2)
    public void addNewCustomer()
    {
    homePage.addNewCustomerLink.click();
    homePage.customerName.sendKeys("balakrishna");
    homePage.gender.click();
    homePage.dob.sendKeys("01012000");
    homePage.address.sendKeys("pocharam");
    homePage.city.sendKeys("hyderabad");
    homePage.state.sendKeys("telengana");
    homePage.pin.sendKeys("500088");
    homePage.phoneNumber.sendKeys("7702515210");
    homePage.emailId.sendKeys("balakrishna@gmail.com");
    homePage.password.sendKeys("Bala@123");
    homePage.submitButton.click();

    }
}
