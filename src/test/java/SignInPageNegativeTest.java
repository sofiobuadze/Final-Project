import com.Amazon.StepObject.SignInPageSteps;
import com.Amazon.Utils.ChromeRuner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Listeners(com.Amazon.Utils.TestLister.class)
public class SignInPageNegativeTest extends ChromeRuner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
    @Link(name = "Example", type = "https://example.org")

    public void SignInNegativeTest(){
        SignInPageSteps steps = new SignInPageSteps();
        steps.goToSignInPage()
                .goToSignIn();
        $(byText("Enter your email or mobile phone number")).shouldBe(Condition.visible);
        String str=$(By.xpath("//*[@id=\"auth-email-missing-alert\"]/div/div")).getText();
        Assert.assertEquals("Enter your email or mobile phone number",str);
    }
}
