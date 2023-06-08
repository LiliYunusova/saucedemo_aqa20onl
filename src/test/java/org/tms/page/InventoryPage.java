package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page{

    @FindBy(xpath = "//span[@class = 'title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCardSauceLabsBackPack;

    @FindBy(xpath = "//div[@id = 'shopping_cart_container']")
    private WebElement basketButton;

    public String getTextOfNameOfMainPageSection(){
        return waitVisibilityOf(nameOfMainPageSection).getText();
    }

    public InventoryPage clickAddToCardSauceLabsBackPack(){
        addToCardSauceLabsBackPack.click();
        return this;
    }

    public void clickBasketButton(){
        basketButton.click();
    }

}
