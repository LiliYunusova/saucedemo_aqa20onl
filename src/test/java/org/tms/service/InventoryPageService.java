package org.tms.service;

import org.tms.page.BasketPage;
import org.tms.page.InventoryPage;

public class InventoryPageService {

    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualTextOfInventoryPage(){
        return inventoryPage.getTextOfNameOfMainPageSection();
    }

    public BasketPageService addToCard(){
        inventoryPage.clickAddToCardSauceLabsBackPack().clickBasketButton();
        return new BasketPageService();
    }
}
