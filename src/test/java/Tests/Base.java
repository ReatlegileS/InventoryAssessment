package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.InventoryForm;
import Pages.CartPage;
import Pages.InvoicePage;
import Utils.BrowserFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;


public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("Chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);
    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    InventoryForm inventoryForm= PageFactory.initElements(driver, InventoryForm.class);
    CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
    InvoicePage invoicePage= PageFactory.initElements(driver, InvoicePage.class);
    }



