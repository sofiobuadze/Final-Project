package com.Amazon.StepObject;

import com.Amazon.PageObject.RegisterPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class RegisterPageSteps extends RegisterPage {
    @Step("Go to register page")
    public RegisterPageSteps goToRegisterPage() {
        createAccount.click();
        createAccountButton.click();
        return this;
    }

    @Step("name is {name}")
    public RegisterPageSteps setName(String Name) {
        firstname.setValue(Name);
        firstname.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("mail is {e_mail}")
    public RegisterPageSteps setMail(String e_mail) {
        emailAdress.setValue(e_mail);
        return this;
    }

    @Step("Password is {password}")
    public RegisterPageSteps setPassword(String password) {
        passwordValue.setValue(password);
        return this;
    }

    @Step("Re Enter Password is {password}")
    public RegisterPageSteps reEnterPassword(String password) {
        rePassword.setValue(password);
        return this;
    }

    @Step("Create account")
    public RegisterPageSteps createNewAccount() {
        continueButton.click();
        return this;
    }
}
