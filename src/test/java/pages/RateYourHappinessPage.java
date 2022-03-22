package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessPage {

    SelenideElement subTitle = $(By.xpath("//p[@class='subtitle']"));

    public String subtitleIsExisted() {
        return subTitle.getText();
    }
}
