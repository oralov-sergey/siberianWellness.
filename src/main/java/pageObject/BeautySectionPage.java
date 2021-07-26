package pageObject;

import core.ActionsOnThePage;
import core.SuperClass;
import io.qameta.allure.Step;

public class BeautySectionPage extends SuperClass {

    public static final String FIRST_PRODUCT_XPATH = "//a[@class='rr-item__info rr-item__title']";
    public static final String ADD_PRODUCT_BUTTON_XPATH = "(//span[@class='ng-binding'])[1]";
    public static final String PRODUCT_BASKET_LINK_XPATH = "//div[@class='navbar_main__cart']";

   @Step("Scroll to products")
    public void scrollToProducts(){
       ActionsOnThePage.waitPresenceOfElement(FIRST_PRODUCT_XPATH);
       ActionsOnThePage.scrollIntoView(FIRST_PRODUCT_XPATH);
    }

    @Step("Add product and switch to product basket")
    public void addFirstProductAndSwitchToBasket(){
       ActionsOnThePage.waitElementAndClick(FIRST_PRODUCT_XPATH);
       ActionsOnThePage.waitElementAndClick(ADD_PRODUCT_BUTTON_XPATH);
       ActionsOnThePage.scrollIntoView(PRODUCT_BASKET_LINK_XPATH);
       ActionsOnThePage.waitElementAndClick(PRODUCT_BASKET_LINK_XPATH);
    }

}
