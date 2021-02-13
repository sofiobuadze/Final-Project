package com.Amazon.StepObject;

import com.Amazon.PageObject.SignInPage;
import io.qameta.allure.Step;

public class SignInPageSteps extends SignInPage {

    @Step("Go to Sign-In page")
    public SignInPageSteps goToSignInPage(){
        signInButton.click();
        return this;
    }

    @Step("Sign-in email is {e_mail}")
    public SignInPageSteps setSignInEmailAd (String e_mail) {
        setEmailAd.setValue(e_mail);
        return this;
    }

    @Step("Go to Sign-In page")
    public SignInPageSteps goToSignIn(){
        continueButtonClick.click();
        return this;
    }

    @Step("Password is {pass}")
    public SignInPageSteps setSignInPassword (String pass) {
        setPassword.setValue(pass);
        return this;
    }

    @Step("Sign-In account")
    public SignInPageSteps signInAccount(){
        signInButtonClick.click();
        return this;
    }

}
