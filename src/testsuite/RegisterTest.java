package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 */
public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";           //Base url

    @Before
    public void setUp() {               //Browser open code
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {            //Navigate to register page test
        //Find register element and click on that
        WebElement registerElement = driver.findElement(By.linkText("Register"));
        registerElement.click();
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to register page", expectedText, actualText);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {                    //Register successfully test
        //Find register element and click on that
        WebElement registerElement = driver.findElement(By.linkText("Register"));
        registerElement.click();
        driver.findElement(By.id("gender-male")).click();                                                                           //Click on gender
        driver.findElement(By.id("FirstName")).sendKeys("Nishit");                                                       //Enter first name
        driver.findElement(By.id("LastName")).sendKeys("Chitaliya");                                                     //Enter last name
        driver.findElement(By.name("DateOfBirthDay")).findElement(By.xpath("//option[text()='6']")).click();           //Select day
        driver.findElement(By.name("DateOfBirthMonth")).findElement(By.xpath("//option[text()='March']")).click();     //Select month
        driver.findElement(By.name("DateOfBirthYear")).findElement(By.xpath("//option[text()='1999']")).click();       //Select year
        driver.findElement(By.id("Email")).sendKeys("nishit123456chitaliya@gmail.com");                                   //Enter email
        driver.findElement(By.id("Password")).sendKeys("Nishit@8664");                                                   //Enter password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Nishit@8664");                                            //Confirm password
        driver.findElement(By.id("register-button")).click();                                                                       //Click on register button
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User not registered successfully.", expectedText, actualText);
    }

    @After
    public void tearDown() {                    //Browser closing code
        closeBrowser();
    }
}
