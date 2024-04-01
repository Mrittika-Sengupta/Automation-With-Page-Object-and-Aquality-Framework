package framework.tests;

import aquality.selenium.browser.AlertActions;
import framework.pages.JavaScriptAlertsPage;
import framework.pages.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    private JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Test
    public void alertTest() {
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        javaScriptAlertsPage.clickForJsAlertBtn();
        browser.handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
    }
}
