package app.pages.supervisor;

import app.pages.BasePage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProposalListPage extends BasePage {
    public ElementsCollection proposalCardsList = $$("[data-test^='supervisor-project-proposal-card']");
    public SelenideElement rejectionReasonButton = $("[data-test='supervisor-project-proposal-card-rejection-reason-button']");
    public SelenideElement rejectionModal = $("[data-test='supervisor-project-proposal-card-show-rejection-modal'] section.modal.m");
    public SelenideElement rejectionReasonText = $("[data-test='project-proposal-rejection-reason-modal-reason-text']");
    public ProposalListPage(String pageUrl) {
        super(pageUrl);
    }
}
