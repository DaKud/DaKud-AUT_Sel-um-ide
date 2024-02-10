package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CreatePostPage {
    
    public SelenideElement elementTitle(){
        return $x("//*[@type='text']");
        
    }

    public SelenideElement elementDescription(){
        return $x("//textarea[@class='mdc-text-field__input']");
        
    }

    public SelenideElement elementButtonSave(){
        return $x("//*[@type='submit']");

    public void savePost(String titleText, String descriptionText) {

    SelenideElement titleField = $x("//input[@type='text']");
    titleField.sendKeys(titleText);


    SelenideElement descriptionField = $x("//textarea[@class='mdc-text-field__input']");
    descriptionField.sendKeys(descriptionText);

    SelenideElement saveButton = $x("//button[@type='submit']");
    saveButton.click();
    }
}

