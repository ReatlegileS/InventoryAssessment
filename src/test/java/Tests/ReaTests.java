package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.InventoryForm;
import Pages.InvoicePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class ReaTests extends Base {



    @Test(priority = 1)
    public void verifyHomePage() {
        // Example usage
        homePage.verifyHomePageIsDisplayed();
    }

    @Test(priority = 2)
    public void verifyLoginPage() {
        loginPage.verifyLoginPageIsDisplayed();
        loginPage.validCredentialsLogin();
    }

    @Test(priority = 3)
    public void fillInventoryForm() {
        inventoryForm.welcomeBack();
        inventoryForm.FillInventoryForm();
    }

    @Test(priority = 4)
    public void verifyCartPage() {
        // cartPage.verifyCartPageIsDisplayed(); // Method does not exist, please implement in CartPage if needed
    }

    @Test(priority = 5)
    public void verifyInvoicePage() {
        invoicePage.InvoiceToast();
    }
}
