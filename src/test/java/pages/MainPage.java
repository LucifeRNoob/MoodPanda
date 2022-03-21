package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));

    public int getTitleQuantity() {
        globalFeedTitle.get(1).shouldBe(visible);
        return globalFeedTitle.size();
    }
}
