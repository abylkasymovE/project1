package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrdersPage {
    public OrdersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Orders']")
    public WebElement orderButton;

    @FindBy(name = "search")
    public WebElement searchSection;

    @FindBy(xpath = "//div[@id='mui-component-select-branchId']")
    public WebElement city;

    @FindBy(xpath = "//li[text()='My Branch']")
    public WebElement chooseCity;

    @FindBy(xpath = "//div[@id='mui-component-select-deliveryType']")
    public WebElement deliveryType;

    @FindBy(xpath = "//li[text()='Around the city']")
    public WebElement choosingDeliveryType;

    @FindBy(xpath = "//button[@class='sc-jJoQJp ieRzNh MuiButtonBase-root sc-hiCibw brQKVM MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium']")
    public WebElement dateButton;

    @FindBy(xpath = "(//button[@class='sc-jJoQJp ieRzNh MuiButtonBase-root sc-eoHXOn bQeCHV MuiPickersDay-root MuiPickersDay-dayWithMargin'])[1]")
    public WebElement fromDate;

    @FindBy(xpath = "//button[@class='sc-jJoQJp ieRzNh MuiButtonBase-root sc-hiCibw brQKVM MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium']")
    public WebElement dateButton2;

    @FindBy(id = "(//button[@class='sc-jJoQJp ieRzNh MuiButtonBase-root sc-eoHXOn bQeCHV MuiPickersDay-root MuiPickersDay-dayWithMargin'])[20]")
    public WebElement chooseFromDate;

    @FindBy(xpath = "//input[@id='mui-7']")
    public WebElement toDate;
    @FindBy(xpath = "//button[text()='29']")
    public WebElement chooseToDate;

    //there is no search button
}
