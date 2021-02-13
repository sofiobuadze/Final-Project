import com.Amazon.StepObject.RegisterPageSteps;
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
public class RegisterPageNegativeTest extends ChromeRuner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
    @Link(name = "Example", type = "https://example.org")

    public void RegisterNegativeTest(){
        RegisterPageSteps steps = new RegisterPageSteps();
        steps.goToRegisterPage()
                .createNewAccount();
        $(byText("Enter your name")).shouldBe(Condition.visible);
        String str=$(By.xpath("//*[@id=\"auth-customerName-missing-alert\"]/div/div")).getText();
        Assert.assertEquals("Enter your name",str);
        $(byText("Enter your email")).shouldBe(Condition.visible);
        String str1=$(By.xpath("//*[@id=\"auth-email-missing-alert\"]/div/div")).getText();
        Assert.assertEquals("Enter your email",str1);
        $(byText("Enter your password")).shouldBe(Condition.visible);
        String str2=$(By.xpath("//*[@id=\"auth-password-missing-alert\"]/div/div")).getText();
        Assert.assertEquals("Enter your password",str2);


    }


}
