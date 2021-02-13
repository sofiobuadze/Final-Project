package com.Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    protected SelenideElement
            signInButton=$("#nav-link-accountList"),
            setEmailAd=$("#ap_email"),
            continueButtonClick=$("#continue"),
            setPassword=$("#ap_password"),
            signInButtonClick=$("#signInSubmit");
}
