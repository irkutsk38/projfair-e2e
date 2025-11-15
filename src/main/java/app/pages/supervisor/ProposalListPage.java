package app.pages.supervisor;

import app.pages.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProposalListPage extends BasePage {
    public SelenideElement proposalList = $(By.className("panel"));
    public ProposalListPage(String pageUrl) {
        super(pageUrl);
    }
}
