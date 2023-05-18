package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import page.LanguageChange1;
import page.OldMyPage;

import java.time.Duration;

public class TestAllPages {
    WebDriver driver;
    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 1)
    public void loginTest(){
        // Open the website
        driver.get("https://oldmy.sdu.edu.kz");
        OldMyPage oldMyPage = new OldMyPage(driver);

        oldMyPage.fillUserID("200103472");
        oldMyPage.fillPassword("kama6281440");
        oldMyPage.clickLoginBtn();

        WebElement welcomeMessage = driver.findElement(By.xpath("//*[@id=\"divModule\"]/div[1]"));
        Assert.assertTrue(welcomeMessage.isDisplayed(), "Login failed!");
    }

    @Test(priority = 2)
    public void LanguageMethod() throws InterruptedException {

        LanguageChange1 languageChange1 = new LanguageChange1(driver);
        languageChange1.clickSettingBtn();
        languageChange1.clickSelectingBtn();
        languageChange1.clickLanguageBtn();
        Thread.sleep(500);
        languageChange1.clickSaveButton();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
        languageChange1.clickHomePageButton();
        Thread.sleep(500);
        languageChange1.clickGradesButton();
        Thread.sleep(500);
        languageChange1.clicklistGrades();
        Thread.sleep(500);
        languageChange1.clickyears();
        Thread.sleep(500);
        languageChange1.clickShow();
        Thread.sleep(5000);




    }




    @AfterSuite()
    public void close(){
        driver.close();
    }
}
