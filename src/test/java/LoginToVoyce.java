import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class LoginToVoyce {

        private static final String HOME_PAGE_URL = "https://voyceglobal.com/manager/Main/login.aspx?company=ClosingTheGap";
        private static WebDriver driver;
    protected static WebDriverWait wait;

        @Test
        public void testStart(){

         driver=SharedDriver.getWebDriver();
            driver.get(HOME_PAGE_URL);
            WebElement loginElement=driver.findElement(By.xpath("//input[@id='txtLoginName']"));
            assertNotNull(loginElement);
            loginElement.sendKeys("Sanjay.Nandakumar@Closingthegap.ca");
            WebElement passwordElement=driver.findElement(By.xpath("//input[@id='txtPwd']"));
            assertNotNull(passwordElement);
            passwordElement.sendKeys("Voyce@123");

            WebElement loginButtonElement=driver.findElement(By.xpath("//img[@name='imageField2']"));
            assertNotNull(loginButtonElement);
            loginButtonElement.click();
            wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tr[@id='HTI_trNavBg']//descendant::*[text()='Clients']")));
            driver.findElement(By.xpath("//tr[@id='HTI_trNavBg']//descendant::*[text()='Clients']")).click();

            //driver.findElement(By.xpath("//*[text()='Create new account']")).click();
            //Thread.sleep(1000);
        }


//    @Test
//    public void genderTest()throws InterruptedException {
//        driver.findElement(By.xpath("//*[@class='navbar-c-only-buttons-wrap']//descendant::*[@href='https://voyceglobal.com/ClientSignUp/']")).click();
//        Thread.sleep(5000);
////      assertNotNull(driver.findElement(By.xpath("//*[@name='websubmit']")));
//        assertNotNull(driver.findElement(By.xpath("//*[text()='Create A Voyce Account']")));
}
//Sanjay.Nandakumar@Closingthegap.ca    Voyce@123
//https://voyceglobal.com/manager/Main/login.aspx?company=ClosingTheGap     $x("//tr[@id='HTI_trNavBg']//descendant::*[@text()='Clients']")