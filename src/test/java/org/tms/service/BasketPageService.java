package org.tms.service;

import org.tms.page.BasketPage;

public class BasketPageService {

    BasketPage basketPage = new BasketPage();

    public String getActualTextAddToCard(){
        return basketPage.getTextOfBasketPage();
    }
}
