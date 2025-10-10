package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {
    WebDriver driver;

    @FindBy(id = "cart-title")
    WebElement CartTitle;
    @FindBy(id = "cart-item-decrease-1760084608183.6814")
    WebElement decreaseButton;
    @FindBy(id = "review-cart-btn")
    WebElement reviewCartButton;
    @FindBy(id = "confirm-cart-btn")
    WebElement placeOrderButton;

    public void CartTitle() {
        Assert.assertTrue(CartTitle.isDisplayed());
    }
    public void CartReview() {
        decreaseButton.click();
        reviewCartButton.click();
        placeOrderButton.click();
    }
}
