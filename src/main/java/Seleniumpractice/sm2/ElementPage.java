package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class ElementPage {
    public ElementsCollection elementsPage(){
        return $$x("//button");
    }

   public void deletePost() {
    SelenideElement deleteButton = $x("//button[contains(@class, 'delete-post-button')]").first();
    deleteButton.click();
}
    }
    public void editButton(){
        elementsPage().first().click();
    }
}
