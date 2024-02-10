package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class RemakeNamePage {
 public SelenideElement elementFirstDummyCard(){
        return $x("//div[@class='posts svelte-127jg4t']/a");
    }
    public SelenideElement elementDummyEditPostButton(){
        return $x("//div[@class='button-block svelte-tv8alb']/button");
    }
    public SelenideElement  elementFieldToTitle(){
        return $x("//input[@type='text']");
    }
    public SelenideElement  elementButtonSave(){
        return $x("//*[@type='submit']");
    }
    public SelenideElement  elementUserPageButton(){
        return $x("//a[contains(text(),'Hello')]");
    }
    public SelenideElement  elementProfileButton(){
        return $x("//ul[@class='mdc-deprecated-list']/li");
    }


public void openFirstDummyCardAndSaveNewName(String name) 
    SelenideElement firstDummyCard = $x("//div[@class='posts svelte-127jg4t']/a");
    firstDummyCard.click();

    SelenideElement editPostButton = $x("//div[@class='button-block svelte-tv8alb']/button");
    editPostButton.shouldBe(visible).click();

    SelenideElement titleField = $x("//input[@type='text']");
    titleField.clear();
    titleField.sendKeys(name);

    SelenideElement saveButton = $x("//*[@type='submit']");
    saveButton.click();

    String expectedTitle = "Edited Post - " + name;
    Selenide.title().shouldBe(expectedTitle);
}
