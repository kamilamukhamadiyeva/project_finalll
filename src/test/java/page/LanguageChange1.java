package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageChange1 {
    WebDriver driver;
    @FindBy(xpath = "//input[@value='Save']")
    WebElement saveBtn;
    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[2]/td[1]/div/div[24]/a")
    WebElement settings;
    @FindBy(xpath = "//*[@id=\"interface_lang\"]")
    WebElement selecting;
    @FindBy(xpath = "//*[@id=\"interface_lang\"]/option[2]")
    WebElement language;
    @FindBy(xpath = "//*[@id=\"divContent\"]/input")
    WebElement SaveBtn;
    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[2]/td[1]/div/div[1]/a")
    WebElement homePage;
    @FindBy(xpath = "/html/body/div/div/table/tbody/tr[2]/td[1]/div/div[11]/a")
    WebElement grades;
    @FindBy(xpath = "//*[@id=\"ysem\"]")
    WebElement listOfGrades;
    @FindBy(xpath = "//*[@id=\"ysem\"]/option[3]")
    WebElement years;
    @FindBy(xpath = "//*[@id=\"divModule\"]/div[2]/input")
    WebElement show;


    public void clickShow(){
        show.click();
    }

    public void clickyears(){
        years.click();
    }

    public void clicklistGrades(){
        listOfGrades.click();
    }

    public void clickGradesButton(){
        grades.click();
    }

    public void clickHomePageButton(){
        homePage.click();
    }

    public void clickSaveButton(){
        SaveBtn.click();
    }

    public void clickLanguageBtn(){
        language.click();
    }

    public void clickSelectingBtn(){
        selecting.click();
    }

    public void clickSettingBtn(){
        settings.click();
    }

    public void clickSaveBtn(){
        saveBtn.click();
    }

    public LanguageChange1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
