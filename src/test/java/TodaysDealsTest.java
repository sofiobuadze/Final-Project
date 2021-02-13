import com.Amazon.StepObject.TodaysPageSteps;
import com.Amazon.Utils.ChromeRuner;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Amazon.Utils.TestLister.class)
public class TodaysDealsTest extends ChromeRuner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
    @Link(name = "Example", type = "https://example.org")

    public void DealsAndPromotionTest(){
        TodaysPageSteps steps = new TodaysPageSteps();
        steps.GoToPage()
                .SortItemBy()
                .SortItemByPriceLowHigh();
        sleep(3000);

    }

}
