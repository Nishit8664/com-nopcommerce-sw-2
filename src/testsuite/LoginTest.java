package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully *
 * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";           //Base url

    @Before
    public void setUp() {               //Browser open code
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {   //Navigate to login page test
        //Find login element and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated.", expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() { //Login with valid credentials
        //Find and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        driver.findElement(By.id("Email")).sendKeys("chitaliyanishit479@gmail.com");  //Enter email
        driver.findElement(By.id("Password")).sendKeys("Nishit@8664");                //Enter valid password
        driver.findElement(By.xpath("//button[text()='Log in']")).click();          //Click on login button
        String expectedText = "Log out";
        String actualText = driver.findElement(By.linkText("Log out")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not login successfully", expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {
        //find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");                                    //Enter invalid email
        driver.findElement(By.name("Password")).sendKeys("Prime1223");                //Enter invalid password
        driver.findElement(By.xpath("//button[text()='Log in']")).click();          //Click login button
        String expectedErrorText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorText = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']")).getText();
        //Compare 2 strings
        Assert.assertEquals("Error message not displayed", expectedErrorText, actualErrorText);
    }


    @After
    public void tearDown() {                    //Browser closing code
        closeBrowser();
    }

}
