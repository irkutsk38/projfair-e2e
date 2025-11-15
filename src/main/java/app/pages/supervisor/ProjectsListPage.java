package app.pages.supervisor;

import app.pages.BasePage;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ProjectsListPage extends BasePage {
    public ElementsCollection projectsList = $$(By.className("card"));
    public ProjectsListPage(String pageUrl) {
        super(pageUrl);

    }

}
