package com.Amazon.Utils;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ChromeRuner {
    @BeforeTest (description = "Configure browser before tests")
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.amazon.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.amazon.com/");
    }
    @AfterTest
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.close();
    }


}
