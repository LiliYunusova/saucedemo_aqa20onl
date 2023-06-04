package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.service.BasketPageService;
import org.tms.service.InventoryPageService;
import org.tms.service.LoginPageService;

public class BasketPageTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void addToCardTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        BasketPageService basketPageService = inventoryPageService.addToCard();
        String actualTextOfAddToBasket = basketPageService.getActualTextAddToCard();
        String expectedTextOfAddToBasket = "Sauce Labs Backpack";
        Assert.assertEquals(actualTextOfAddToBasket, expectedTextOfAddToBasket, "Nothing found");
    }
}
