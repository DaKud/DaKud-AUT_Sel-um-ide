package CreateSelenideThroughSelenium.sm1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class AbstractTest {

    private static final String LOGIN = "AdEllie";
    private static final String PASSWORD = "ed33fb7c8a";

    @BeforeEach
    void init() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Selenide.open("https://test-stand.gb.ru/login");
        Configuration.pageLoadTimeout = 5000;
    }

    @AfterEach
    void tearDown() {
        try {
            Selenide.closeWebDriver();
        } catch (Exception e) {
        }
    }
}