import core.SuperClass;
import org.junit.Test;
import pageObject.SiberianHealthPage;

public class SiberianWellnessProductBasketTest extends SuperClass {
   @Test
    public void siberianWellnessProductBasketTest(){
       siberianHealthPage.getBrowser();
       siberianHealthPage.goToBeautySection();
       beautySectionPage.scrollToProducts();
       beautySectionPage.addFirstProductAndSwitchToBasket();
       productBasketPage.checkProductAvailability();
      System.out.println();
   }
}
