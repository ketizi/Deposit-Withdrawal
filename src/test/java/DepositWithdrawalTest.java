import PageObject.HomePage;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class DepositWithdrawalTest extends ChromeRunner {

    @Test
    public void DepositFunctionality() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.username();
        home.password();
        home.enter();
        home.setMobileInput();
        home.setGetEnterButton();
        home.setNotificationPopUp2();
        home.setNotification();
        home.setDeposit();
        home.setAmountInput();
        home.setAmountInput2();
        home.setCard();
        home.setDepositInput();
    }
}
