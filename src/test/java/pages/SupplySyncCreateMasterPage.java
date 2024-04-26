package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class SupplySyncCreateMasterPage {
    public SupplySyncCreateMasterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[text()='Masters']")
    public WebElement masterDashboard;

   // public void clickMaster(){masterDashboard.click();}

    @FindBy(xpath = "//button[contains(text(),\"Create Master\")]")
   public WebElement buttonCreateMaster;

    @FindBy(name = "name")
   public WebElement name;

    @FindBy(name="lastName")
   public WebElement lastName;

    @FindBy(name="email")
   public WebElement email;

    @FindBy(name="password")
 public    WebElement passwordMaster;

    @FindBy(name="location")
    public    WebElement locationMaster;

   @FindBy(xpath = "//input[@placeholder='+1 ___ ___ ____ *']")
   public WebElement numberMaster;

    @FindBy(id = "mui-component-select-branch_id")
   public WebElement branchClick;

    @FindBy(xpath = "//li[@data-value='4']")
    public WebElement chooseBranch;

    @FindBy(xpath = "//button[@form='add-master-form']")
    public WebElement saveMaster;



}
