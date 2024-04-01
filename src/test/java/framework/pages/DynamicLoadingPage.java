package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicLoadingPage extends Form {

    private static final String DynamicLoadingUrl = "https://the-internet.herokuapp.com/dynamic_loading";
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private static final String PAGE_NAME = "Dynamic Loading";

    private final By CLICK_FOR_EXAMPLE_2 = By.xpath("//*[@id=\"content\"]/div/a[2]");

    private final By CLICK_FOR_START_BUTTON = By.xpath("//*[@id=\"start\"]/button");

    private final By FINISH_BUTTON = By.id("finish");
    private IButton clickExampleBtn = elementFactory.getButton(CLICK_FOR_EXAMPLE_2, "Click for Example 2");
    private IButton clickForStartBtn = elementFactory.getButton(CLICK_FOR_START_BUTTON, "Click for Start Button");

    public DynamicLoadingPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }
    public void clickExampleBtn() {
        clickExampleBtn.click();
    }
    public void clickForStartBtn()

    {
        clickForStartBtn.click();

    }
    public boolean isFinishButtonDisplayed() {
        return elementFactory.getTextBox(FINISH_BUTTON, "Finish Button").getText().contains("Hello World!");
    }

    public boolean isDynamicLoadingPageOpened() {
        return AqualityServices.getBrowser().getDriver().getCurrentUrl().equals(DynamicLoadingUrl);
    }
}