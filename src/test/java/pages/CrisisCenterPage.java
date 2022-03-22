package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CrisisCenterPage {

    SelenideElement crisisTitle = $(By.xpath("//p[@class='title']"));

    public String crisisTitleIsExisted() {
        return crisisTitle.getText();
    }
}
