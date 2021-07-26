package pageObject;

import core.SuperClass;
import io.qameta.allure.Step;

import static core.ActionsOnThePage.getBrowser;
import static core.ActionsOnThePage.waitElementAndClick;

public class SiberianHealthPage extends SuperClass {

    public static final String URL = "https://ru.siberianhealth.com/ru/";
    public static final String BEAUTY_SECTION_LINK_XPATH = "(//a[@class='navbar_main__menu__lnk'])[4]";
    public static final String EXPECTED_MESSAGE_CLOSE_BUTTON_XPATH = "//button[@class='digi-search-highlight__close']";

    @Step("Get to siberianhealth.com/ru")
    public void openSite() {
        getBrowser(URL);
    }

    @Step("Go to beauty section")
    public void goToBeautySection() {
        waitElementAndClick(EXPECTED_MESSAGE_CLOSE_BUTTON_XPATH);
        waitElementAndClick(BEAUTY_SECTION_LINK_XPATH);
    }
}
