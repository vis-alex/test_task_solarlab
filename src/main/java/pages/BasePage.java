package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    public void clickAByHref(String link) {
        $(By.xpath("//a[@href='" + link + "']")).click();
    }

    public void clickDivByClass(String clazz) {
        $(By.xpath("//div[@class='" + clazz + "']")).click();
    }

    public void clickDivByText(String text) {
        $(By.xpath("//div[text()='" + text + "']")).click();
    }

    public void clickLabel(String text) {
        $(By.xpath("//label[text()='" + text + "']")).click();
    }

    public void clickButtonByText(String text) {
        $(By.xpath("//button[text()='" + text + "']")).click();
    }
}
