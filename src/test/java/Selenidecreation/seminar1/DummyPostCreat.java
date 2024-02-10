package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CreateDummyTest extends AbstractTest {

    private SelenideElement loginNew() {
        return $x("//*[@type='text']");
    }

    private SelenideElement passwordNew() {
        return $x("//*[@type='password']");
    }

    private SelenideElement buttonNew() {
        return $x("//*[@class='mdc-button__label']");
    }

    private SelenideElement titleNew() {
        return $x("//*[@type='text']");
    }

    private SelenideElement descriptionNew() {
        return Selenide.$("div.field textarea.mdc-text-field__input");
    }

    private SelenideElement buttonPage() {
        return $x("//*[@type='submit']");
    }

    private SelenideElement elementsDummy() {
        return $x("//h1[@class='svelte-tv8alb']");
    }

    @Test
    @DisplayName("Create Dummy with delay")
    void createDummyInPage() {
        loginNew().sendKeys(login);
        passwordNew().sendKeys(password);
        buttonNew().shouldBe(visible).click();

        titleNew().sendKeys("New Dummy test");
        descriptionNew().sendKeys("This is description of new Dummy");
        buttonPage().shouldBe(visible).click();

        Assertions.assertEquals("New Dummy test", elementsDummy().text());
    }
}
