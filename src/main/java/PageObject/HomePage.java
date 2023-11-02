package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static DataObject.LogInData.*;

public class HomePage {
    public static WebElement Betlive;
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameInput = By.id("main-username");
    By passwordInput = By.id("main-password");
    By enterButton = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[2]/form/div/div[3]/ui-button/button");
    By mobileInput = By.id("mobileNumberOrId");
    By getEnterButton = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/auth-extended/div/form/div[2]/design-system-button/button");
    By notificationPopUp = By.xpath("//*[@id=\"mat-dialog-0\"]/app-website-request-modal/div/div[1]/div[2]");
    By notificationPopUp2 = By.xpath("/html/body/div/div/button");
    By deposit = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[2]/ui-button/button");
    By amountInput = By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/app-website-deposit/div/div/div[2]/div/app-website-amount-input/div/div[2]/input");
    By card = By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/app-website-deposit/div/div/div[2]/div/div[2]/app-website-cards/div[2]/div[2]/div/div/common-card/div");
    By depositInput = By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/app-website-deposit/div/div/div[2]/div/div[4]/ui-button/button");


    public void username() {
        driver.findElement(usernameInput).sendKeys(userNameData);
    }

    public void password() {
        driver.findElement(passwordInput).sendKeys(passwordData);

    }

    public void enter() throws InterruptedException {
        driver.findElement(enterButton).click();
        Thread.sleep(3000);
    }
    public void  setMobileInput() throws InterruptedException {
        driver.findElement(mobileInput).sendKeys(number);
        Thread.sleep(5000);
    }
    public void setGetEnterButton(){
        driver.findElement(getEnterButton).click();
    }
    public void setNotificationPopUp2(){
        driver.findElement(notificationPopUp2).click();
    }

    public void setNotification() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement notification = wait.until(ExpectedConditions.elementToBeClickable(notificationPopUp));
        driver.findElement(notificationPopUp).click();
    }

    public void setDeposit() throws InterruptedException {
        driver.findElement(deposit).click();
        Thread.sleep(3000);
    }

    public void setAmountInput() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement setAmountInput = wait.until(ExpectedConditions.elementToBeClickable(amountInput));
        driver.findElement(amountInput).clear();
    }

    public void setAmountInput2() {
        driver.findElement(amountInput).sendKeys(amount);
    }
    public void setCard(){
        driver.findElement(card).click();
    }
    public void setDepositInput(){
        driver.findElement(depositInput).click();
    }
}




