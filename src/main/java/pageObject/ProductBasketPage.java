package pageObject;

import core.SuperClass;
import io.qameta.allure.Step;

import static core.ActionsOnThePage.getText;
import static core.ActionsOnThePage.presenceOfElements;

public class ProductBasketPage extends SuperClass {

    public static final String NUMBER_OF_PRODUCTS_TEXT_XPATH = "(//div[@class='total-cart-block__right ng-binding'])[1]";
    public static final String LIST_OF_PRODUCTS_IN_THE_BASKET_XPATH = "//div[@class='os-order-page__content']";

    @Step("Get number of products")
    public String getProductNumber() {
        return getText(NUMBER_OF_PRODUCTS_TEXT_XPATH);
    }

    @Step("Get presence of products")
    public Boolean isProductsInTheBasketPresent() {
        return presenceOfElements(LIST_OF_PRODUCTS_IN_THE_BASKET_XPATH);
    }
}
