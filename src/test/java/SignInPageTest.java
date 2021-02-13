import com.Amazon.StepObject.SignInPageSteps;
import com.Amazon.Utils.ChromeRuner;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.Amazon.DataObject.SignInPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(com.Amazon.Utils.TestLister.class)
public class SignInPageTest extends ChromeRuner {
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some detailed test description")
    @Link(name = "Example", type = "https://example.org")

    public void SignInTest(){
        SignInPageSteps steps = new SignInPageSteps();
        steps.goToSignInPage()
                .setSignInEmailAd(signInEmail)
                .goToSignIn()
                .setSignInPassword(signInPassword)
                .signInAccount();
        sleep(3000);
    }

}
