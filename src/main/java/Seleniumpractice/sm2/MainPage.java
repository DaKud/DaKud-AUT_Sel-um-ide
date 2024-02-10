package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement elementCreateNewPostButton(){
        return $x("create-btn");
    }

    public void createPost() {
    SelenideElement createNewPostButton = $x(".create-new-post-button");
    createNewPostButton.click();
}

