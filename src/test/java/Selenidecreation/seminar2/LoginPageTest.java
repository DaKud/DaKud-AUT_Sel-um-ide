package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageTest extends AbstractTest {

    @Test
    @DisplayName("Check error message in popup window (different variations)")
    void getAuthorizationWithOutParams() {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystemWithOutParams();
        SelenideElement elementSearch = $x("//h2[@class='svelte-uwkxn9']");
        Assertions.assertEquals("401", elementSearch.getText());
    }

    @Test
    @DisplayName("Test for simple dummy name change")
    void getDummyNameRewritten() throws InterruptedException {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystem(getLogin(), getPassword());
        RemakeNamePage remakeNamePage = Selenide.page(RemakeNamePage.class);
        remakeNamePage.openFirstDummyCardAndSaveNewName("New Dummy2");
        SelenideElement searchElement = $x("//div[@class='container svelte-tv8alb']/h1");
        Assertions.assertEquals("New Dummy2", searchElement.getText());
    }

    @Test
    @DisplayName("Test to check the ID of the changed title name")
    void getDummyIDRewritten() throws InterruptedException {
        LoginPage loginPage = Selenide.page(LoginPage.class);
        loginPage.loginInSystem(getLogin(), getPassword());
        RemakeNamePage remakeNamePage = Selenide.page(RemakeNamePage.class);
        remakeNamePage.openFirstDummyCardAndSaveNewName("New Dummy2");
        remakeNamePage.openProfile();
        SelenideElement searchElement = $("tbody tr td");
        Assertions.assertEquals("97341", searchElement.getText());
    }
}
