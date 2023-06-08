package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends Page{

    @FindBy(xpath = "//a[@id = 'item_4_title_link']/div[@class = 'inventory_item_name']")
    private WebElement sauceLabBackPack;

    public String getTextOfBasketPage(){
        return waitVisibilityOf(sauceLabBackPack).getText();
    }
}
