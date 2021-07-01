$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/TestSuite.feature");
formatter.feature({
  "line": 1,
  "name": "TestSuite Test",
  "description": "As a User I want to Select Desktop Option from the Computer Menu into NopCommerce Website",
  "id": "testsuite-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6553502700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User Should add the selected product successfully",
  "description": "",
  "id": "testsuite-test;user-should-add-the-selected-product-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on Computer Link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Desktop Link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to Desktop Page Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should navigate to Build Your Own Computer Page Successfully",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select 2.2 GHz Intel Pentium Dual-Core E2200 \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select 8GB [+$60.00] \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select HDD radio 400 GB [+$100.00] \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select OS radio Vista Premium [+$60.00] \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I  check two check boxes Microsoft Office [+$50.00] and I check Total Commander [+$5.00]",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify the price $1475.00 \"\u003cverifyPrice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on ADD TO CART Button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#    Then    Verify the Message, The product has been added to your shopping cart on Top green Bar \"\u003cverifyMessage1\u003e\""
    }
  ],
  "line": 21,
  "name": "Close the bar clicking on the cross button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 156918800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverOnComputerLink()"
});
formatter.result({
  "duration": 266777000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnDesktopLink()"
});
formatter.result({
  "duration": 1576976400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToDesktopPageSuccessfully()"
});
formatter.result({
  "duration": 1086055900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 3181890700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToBuildYourOwnComputerPageSuccessfully()"
});
formatter.result({
  "duration": 2535606500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    },
    {
      "val": "2",
      "offset": 11
    },
    {
      "val": "2200",
      "offset": 42
    },
    {
      "val": "\u003cvalue\u003e",
      "offset": 48
    }
  ],
  "location": "MyStepdefs.iSelectGHzIntelPentiumDualCoreE(int,int,int,String)"
});
formatter.result({
  "duration": 198380300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 9
    },
    {
      "val": "60",
      "offset": 16
    },
    {
      "val": "00",
      "offset": 19
    },
    {
      "val": "\u003cvalue\u003e",
      "offset": 24
    }
  ],
  "location": "MyStepdefs.iSelectGB$(int,int,int,String)"
});
formatter.result({
  "duration": 201854400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 19
    },
    {
      "val": "100",
      "offset": 29
    },
    {
      "val": "00",
      "offset": 33
    },
    {
      "val": "\u003cvalue\u003e",
      "offset": 38
    }
  ],
  "location": "MyStepdefs.iSelectHDDRadioGB$(int,int,int,String)"
});
formatter.result({
  "duration": 141731400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60",
      "offset": 35
    },
    {
      "val": "00",
      "offset": 38
    },
    {
      "val": "\u003cvalue\u003e",
      "offset": 43
    }
  ],
  "location": "MyStepdefs.iSelectOSRadioVistaPremium$(int,int,String)"
});
formatter.result({
  "duration": 106324500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 45
    },
    {
      "val": "00",
      "offset": 48
    },
    {
      "val": "5",
      "offset": 83
    },
    {
      "val": "00",
      "offset": 85
    }
  ],
  "location": "MyStepdefs.iCheckTwoCheckBoxesMicrosoftOffice$AndICheckTotalCommander$(int,int,int,int)"
});
formatter.result({
  "duration": 1296880100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1475",
      "offset": 18
    },
    {
      "val": "00",
      "offset": 23
    },
    {
      "val": "\u003cverifyPrice\u003e",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.verifyThePrice$(int,int,String)"
});
formatter.result({
  "duration": 2128676200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnADDTOCARTButton()"
});
formatter.result({
  "duration": 249106800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.closeTheBarClickingOnTheCrossButton()"
});
formatter.result({
  "duration": 67700,
  "status": "passed"
});
formatter.after({
  "duration": 893270600,
  "status": "passed"
});
});