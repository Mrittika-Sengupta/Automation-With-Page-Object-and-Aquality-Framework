package framework.tests;

import framework.pages.DynamicLoadingPage;
import framework.pages.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest{

    DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();


    @Test
    public void dynamictest(){

        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_LOADING);
        Assert.assertTrue(dynamicLoadingPage.isDynamicLoadingPageOpened(), "Main page is not opened");
        dynamicLoadingPage.clickExampleBtn();
        dynamicLoadingPage.clickForStartBtn();
        Assert.assertTrue(dynamicLoadingPage.isFinishButtonDisplayed(), "Hello world' element is displayed");

    }
}
