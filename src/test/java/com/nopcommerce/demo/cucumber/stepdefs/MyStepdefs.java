package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs
{

    @Given("^I am on the HomePage$")
    public void iAmOnTheHomePage()
    {

    }

    @When("^I mouse hover on Computer Link$")
    public void iMouseHoverOnComputerLink()
    {
        new HomePage().mouseHoverOnComputer();

    }

    @And("^I click on Desktop Link$")
    public void iClickOnDesktopLink()
    {
        new HomePage().clickOnComputer();
    }

    @Then("^I should navigate to Desktop Page Successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully()
    {
        Assert.assertEquals("Desktops",new DesktopPage().getWelcomeText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("^I am on the DesktopPage$")
    public void iAmOnTheDesktopPage()
    {

    }

    @When("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() throws InterruptedException
    {
        Thread.sleep(3000);
        new DesktopPage().addToCart();
    }


    @Then("^I should navigate to Build Your Own Computer Page Successfully$")
    public void iShouldNavigateToBuildYourOwnComputerPageSuccessfully()
    {
        Assert.assertEquals("Build your own computer",new BuildYourOwnComputerPage().getWelcomeText());

    }

    @And("^I select (\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+) \"([^\"]*)\"$")
    public void iSelectGHzIntelPentiumDualCoreE(int arg0, int arg1, int arg2, String arg3)  {
        new BuildYourOwnComputerPage().selectProcessorAttribute("1");
    }

    @And("^I select (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\] \"([^\"]*)\"$")
    public void iSelectGB$(int arg0, int arg1, int arg2, String arg3)  {
        new BuildYourOwnComputerPage().selectRamAttribute("5");
    }

    @And("^I select HDD radio (\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\] \"([^\"]*)\"$")
    public void iSelectHDDRadioGB$(int arg0, int arg1, int arg2, String arg3)  {
        new BuildYourOwnComputerPage().selectHDDAttribute("7");
    }

    @And("^I select OS radio Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\] \"([^\"]*)\"$")
    public void iSelectOSRadioVistaPremium$(int arg0, int arg1, String arg2)  {
        new BuildYourOwnComputerPage().selectOSAttribute("9"); ;
    }

    @And("^I  check two check boxes Microsoft Office \\[\\+\\$(\\d+)\\.(\\d+)\\] and I check Total Commander \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iCheckTwoCheckBoxesMicrosoftOffice$AndICheckTotalCommander$(int arg0, int arg1, int arg2, int arg3) throws InterruptedException
    {
        Thread.sleep(1000);
        new BuildYourOwnComputerPage().selectSoftwareTotalCommander();
    }

    @And("^Verify the price \\$(\\d+)\\.(\\d+) \"([^\"]*)\"$")
    public void verifyThePrice$(int arg0, int arg1, String arg2) throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertEquals("$1,475.00", new BuildYourOwnComputerPage().getTextForPrice$1475());
    }

    @And("^I click on ADD TO CART Button$")
    public void iClickOnADDTOCARTButton()
    {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

//    @Then("^Verify the Message, The product has been added to your shopping cart on Top green Bar \"([^\"]*)\"$")
//    public void verifyTheMessageTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar(String arg0) throws InterruptedException
//    {
//        Thread.sleep(3000);
//        Assert.assertEquals("The Product has been added to your shopping cart", new BuildYourOwnComputerPage().getTextProductAddedToCart());
//
//    }

    @And("^Close the bar clicking on the cross button$")
    public void closeTheBarClickingOnTheCrossButton()
    {
    }



}
