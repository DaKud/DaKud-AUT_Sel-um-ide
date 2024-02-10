package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    
    public SelenideElement elementLogin(){
        return $x("//*[@type='text']");
    }

    public SelenideElement elementPassword(){
        return $x("//*[@type='password']");
    }

    public SelenideElement elementButton(){
        return $x("//*[@class='mdc-button__label']");
    }


    public void loginInSystem(String login1, String password1) {
    SelenideElement loginField = $x("//input[@type='text']");
    loginField.sendKeys(login1);
    SelenideElement passwordField = $x("//input[@type='password']");
    passwordField.sendKeys(password1);
    SelenideElement loginButton = $x("//button[@type='submit']");
    loginButton.click();
}
