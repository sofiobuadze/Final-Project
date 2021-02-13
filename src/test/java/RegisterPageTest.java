import com.Amazon.StepObject.RegisterPageSteps;
import com.Amazon.Utils.ChromeRuner;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;

import static com.Amazon.DataObject.RegisterPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Amazon.Utils.TestLister.class)
public class RegisterPageTest extends ChromeRuner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
    @Link(name = "Example", type = "https://example.org")

    public void TestAmazon() {
        RegisterPageSteps steps = new RegisterPageSteps();
        steps.goToRegisterPage()
             .setName(yourName)
             .setMail(email)
             .setPassword(enterPassword)
             .reEnterPassword(re_EnterPassword)
             .createNewAccount();
       // Assert.assertEquals("Passwords must match",steps.checkErrors());
        sleep(3000);
    }

}
