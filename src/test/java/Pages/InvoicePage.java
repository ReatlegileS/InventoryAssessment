package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InvoicePage {
    WebDriver driver;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceId;
    @FindBy(id = "invoice-item-INV-1760107275920")
    WebElement invoiceNumber;
    @FindBy(id = "view-invoice-INV-1760107275920")
    WebElement viewInvoice;
    @FindBy(id = "invoice-toast") // Assuming this is the toast element, adjust as needed
    WebElement invoiceToast;

    public InvoicePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void InvoiceToast() {
        invoiceToast.isDisplayed();
        viewInvoiceId.click();
        invoiceNumber.isDisplayed();
        viewInvoice.click();

    }
}
