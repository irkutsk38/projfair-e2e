import org.testng.annotations.*;

import static com.codeborne.selenide.CollectionCondition.size;

public class SupervisorTests extends A_BaseTest {
    @BeforeClass
    void login(){
        app.mainPage.open();
        app.mainPage.login();
    }
    @Test
    void checkProposals() {
        app.proposalListPage.open();
        app.proposalListPage.proposalList.shouldBe();
    }
    @Test
    void checkProjects() {
        app.projectsListPage.open();
        app.projectsListPage.projectsList.shouldHave(size(9));
    }


}
