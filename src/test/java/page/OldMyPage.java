package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OldMyPage {
    WebDriver driver;
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(name = "LogIn")
    WebElement Login_btn;

    public void fillUserID(String userId){
        username.sendKeys(userId);
    }

    public void fillPassword(String password){
        Password.sendKeys(password);
    }

    public void clickLoginBtn(){
        Login_btn.click();
    }

    public OldMyPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
