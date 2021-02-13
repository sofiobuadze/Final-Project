package com.Amazon.StepObject;

import com.Amazon.PageObject.TodaysDealsPage;
import io.qameta.allure.Step;

public class TodaysPageSteps extends TodaysDealsPage {

    @Step("Go to Page")
    public TodaysPageSteps GoToPage(){
        todaysDealsButton.click();
        return this;
    }

    @Step("Sort item")
    public TodaysPageSteps SortItemBy(){
        sortByButton.click();
        return this;
    }
    @Step("Sort item by price - low to high")
    public TodaysPageSteps SortItemByPriceLowHigh(){
        sortBy.click();
        return this;
    }
}
