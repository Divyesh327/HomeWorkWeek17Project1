package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement selectcomputer;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktop;

    public void mouseHoverOnComputer()
    {
        mouseHoverToElement(selectcomputer);
        log.info("Hovering on Computer Menu --> " + selectcomputer.toString());

    }

    public void clickOnComputer()
    {
        clickOnElement(desktop);
        log.info("Click on Desktop Menu --> " + desktop.toString());
    }

}
