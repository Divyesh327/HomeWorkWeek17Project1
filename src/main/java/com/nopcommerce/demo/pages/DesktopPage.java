package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility
{
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;

    @FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement AddtoCart;

    public String getWelcomeText()
    {
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String addToCart()
    {
        clickOnElement(AddtoCart);
        log.info("Click on Add to Cart Menu --> " + AddtoCart.toString());
        return null;
    }

}
