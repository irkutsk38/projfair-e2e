package app.pages;

import app.AppConfig;
import app.PageBuilder;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {
    public SelenideElement projectList = $(By.className("project-list"));
    public SelenideElement authButton = $(By.className("auth-btn"));
    public SelenideElement mainMenu = $(By.className("dropdown-container"));

    public MainPage(String pageURL) {
        super(pageURL);
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
