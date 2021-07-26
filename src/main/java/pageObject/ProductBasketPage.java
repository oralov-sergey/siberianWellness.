package pageObject;

import core.ActionsOnThePage;
import core.SuperClass;
import io.qameta.allure.Step;

public class ProductBasketPage extends SuperClass {

    public static final String NUMBER_OF_PRODUCTS_TEXT_XPATH = "(//div[@class='total-cart-block__right ng-binding'])[1]";

    @Step
    public String getProductNumber(){
       return ActionsOnThePage.getText(NUMBER_OF_PRODUCTS_TEXT_XPATH);
    }

    @Step("Сheck product availability")
    public void checkProductAvailability(){
        ActionsOnThePage.checkNumber(getProductNumber());
    }

}
