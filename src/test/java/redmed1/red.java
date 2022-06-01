package redmed1;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class red {
    @Test
    public void test() {
        Selenide.open("https://redmed.ge/ka/user/auth-user");
        $(byLinkText("რეგისტრაცია")).click();
        $("#userName").setValue("givi");
        $("#lastName").setValue("chichikoshvili");
        $("#mobileNumber").setValue("599392135");
        $("#email").setValue("givichichikoshvili09@gmail.com");
        SelenideElement selectore = $("#userName");
        System.out.println(selectore);

    }

    @Test
    public void test2() {
        Selenide.open("https://redmed.ge/ka/user/auth-user");
        $(byLinkText("რეგისტრაცია")).click();
        $("#userName").click();
        $("#lastName").click();
        $("#userNameError").shouldBe(Condition.visible);
        $("#lastName").click();
        $("#mobileNumber").click();
        $("#lastNameError").shouldBe(Condition.visible);
        $("#mobileNumber").click();
        $("#email").click();
        $("#emailPatientError").shouldBe(Condition.visible);

    }
}