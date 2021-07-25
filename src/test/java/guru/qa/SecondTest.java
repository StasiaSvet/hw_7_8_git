package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondTest {

    @Test
    void secondTest() {

        open("https://github.com/");
        $(byName("q")).setValue("selenide").pressEnter();
        $(byLinkText("selenide/selenide")).click();

    }
}
