import core.SuperClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SiberianWellnessProductBasketTest extends SuperClass {

    public static final String EXPECTED_NUMBER_OF_PRODUCTS_RESULT = "1";

    @Test
    public void siberianWellnessProductBasketTest(){
       siberianHealthPage.openSite();
       siberianHealthPage.goToBeautySection();
       beautySectionPage.scrollToProducts();
       beautySectionPage.addFirstProductAndSwitchToBasket();
       assertEquals(EXPECTED_NUMBER_OF_PRODUCTS_RESULT, productBasketPage.getProductNumber());
       assertTrue(productBasketPage.isProductsInTheBasketPresent());
   }
}
