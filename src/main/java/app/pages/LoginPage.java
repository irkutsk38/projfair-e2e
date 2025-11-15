package app.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public SelenideElement inputLogin = $(byName("USER_LOGIN"));
    public SelenideElement inputPassword = $(byName("USER_PASSWORD"));
    public SelenideElement loginButton = $(byClassName("login-btn"));

    public SelenideElement buttonConfirm = $(byClassName("primary"));

    public LoginPage(String pageURL) {
        super(pageURL);
        }
}
