package com.Amazon.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    protected SelenideElement
    createAccount=$("#nav-link-accountList"),
    createAccountButton=$("#createAccountSubmit"),
    firstname=$("#ap_customer_name"),
    emailAdress=$("#ap_email"),
    passwordValue=$("#ap_password"),
    rePassword=$("#ap_password_check"),
    continueButton=$("#continue");

}
