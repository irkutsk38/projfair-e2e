package app.pages;

import app.AppConfig;
import app.PageBuilder;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.confirm;
import static com.codeborne.selenide.Selenide.dismiss;

public class MainPage extends BasePage {
    public SelenideElement projectList = $(By.className("project-list"));
    public SelenideElement authButton = $("[data-test='header-user-actions-auth-button']");
    public SelenideElement mainMenu = $(By.className("dropdown-container"));

    public MainPage(String pageURL) {
        super(pageURL);
    }

    public void mockLogin(boolean asSupervisor) {
        authButton.click();
        if (asSupervisor) {
            confirm();
        } else {
            dismiss();
            confirm();
        }
    }

    public LoginPage login(){
            authButton.click();
            LoginPage loginPage = PageBuilder.buildLoginPage();
            loginPage.inputLogin.setValue(AppConfig.login);
            loginPage.inputPassword.setValue(AppConfig.password);
            loginPage.loginButton.click();
        return loginPage;
    }
}
