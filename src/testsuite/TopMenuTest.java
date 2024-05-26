package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 4. Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";       //Base Url

    @Before
    public void setUp() {                   //Browser opening code
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Finding and clicking on computer element
        WebElement computerTabElement = driver.findElement(By.linkText("Computers"));
        computerTabElement.click();
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to computer page.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Finding and clicking on electronics element
        WebElement electronicsTabElement = driver.findElement(By.linkText("Electronics"));
        electronicsTabElement.click();
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to electronics page.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Finding and clicking on apparel element
        WebElement apparelTabElement = driver.findElement(By.linkText("Apparel"));
        apparelTabElement.click();
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to apparel page.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Finding and clicking on digital downloads element
        WebElement digitalDownloadsTabElement = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTabElement.click();
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to digital downloads page.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //Finding and clicking on Books element
        WebElement booksTabElement = driver.findElement(By.linkText("Books"));
        booksTabElement.click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to books page.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //Finding and clicking on Jewelry element
        WebElement jewelryTabElement = driver.findElement(By.linkText("Jewelry"));
        jewelryTabElement.click();
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to jewelry page.", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //Finding and clicking on Gift Cards element
        WebElement giftCardsTabElement = driver.findElement(By.linkText("Gift Cards"));
        giftCardsTabElement.click();
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        //Comparing 2 strings
        Assert.assertEquals("User is not navigated to gift cards page.", expectedText, actualText);
    }

    @After
    public void tearDown() {                    //Browser closing code
        closeBrowser();
    }
}
