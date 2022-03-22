package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));

    private SelenideElement postUpdateButton = $(By.xpath("//a[contains(.,'Post update')]"));
    private SelenideElement iAmInCrisisButton = $(By.xpath("//a[@class='button is-danger is-rounded is-outslined is-fullwidth']"));

    public int getTitleQuantity() {
        globalFeedTitle.get(1).shouldBe(visible);
        return globalFeedTitle.size();
    }

    public void goToRateYourHappinessPage() {
        postUpdateButton.click();
    }

    public void goToCrisisPage() {
        iAmInCrisisButton.click();
    }
}
