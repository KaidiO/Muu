package ee.tptlive.testing.uidemo;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UITest {
    @Test
    public void userCanLoginByUsername() {
        //given
        open("http://localhost:8080/personList.jsf");

        //when
        $(By.linkText("John")).click();

        //then
        $("#form").shouldHave(Condition.text("Name:\tJohn"));

    }

}
