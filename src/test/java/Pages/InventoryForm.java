package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InventoryForm {

    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement welcomeBack_id;
    @FindBy(id ="tab-btn-web")
    WebElement webAutomation_id;
    @FindBy(id ="device-type")
    WebElement deviceType;
    @FindBy(id ="brand-name")
    WebElement brandName;
    @FindBy(id = "color")
    WebElement color;
    @FindBy(id = "quantity")
    WebElement quantity;
    @FindBy(id = "address")
    WebElement address;
    @FindBy(id = "discount-feedback")
    WebElement discountMessage;



    //Check that the welcome message appears
    public void welcomeBack() {
        Assert.assertTrue(welcomeBack_id.isDisplayed());
    }
    public void WebAutomation() {
        webAutomation_id.click();
    }
    //Fill in the 1st phase of inventory form (wizard 1)
    public void FillInventoryForm() {

        this.driver.findElement(By.id("tab-btn-web")).click();
        this.driver.findElement(By.id("device-type")).sendKeys("Laptop");
        this.driver.findElement(By.id("brand-name")).sendKeys("Macbook Pro");
        this.driver.findElement(By.xpath("//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]/span")).click();
        this.driver.findElement(By.id("color")).sendKeys("Gold");
        this.driver.findElement(By.id("quantity")).sendKeys("3");
        this.driver.findElement(By.id("address")).sendKeys("456 Gama Street, Sandton");
        this.driver.findElement(By.id("inventory-next-btn")).click();

        // Wizard 2
        this.driver.findElement(By.id("shipping-option-express")).click();
        this.driver.findElement(By.id("warranty-option-1yr")).click();
        this.driver.findElement(By.id("discount-code")).sendKeys("SAVE10");
        this.driver.findElement(By.id("apply-discount-btn")).click();

        // Assert discount feedback is shown
        Assert.assertTrue(discountMessage.isDisplayed(), "Discount message not displayed!");
        this.driver.findElement(By.id("add-to-cart-btn")).click();

    }

}