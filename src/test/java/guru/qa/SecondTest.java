package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SecondTest {

    @Test
    void secondTest() {

        open("https://github.com/");

    }
}
