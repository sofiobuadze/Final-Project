package com.Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.$;

public class TodaysDealsPage {
    protected SelenideElement
            todaysDealsButton=$(byText("Today's Deals")),
            sortByButton=$(".a-dropdown-prompt"),
            sortBy=$(byText("Price - Low to High"));

}
