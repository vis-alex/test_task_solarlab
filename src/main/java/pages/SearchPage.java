package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public static final String DELIVERY_REGION = "Регион поставки";
    public static final String FIND_BUTTON = "Найти";
    public SelenideElement filterByDatesDiv =  $(By.xpath("//div[text()='Фильтры по датам']"));

    public SelenideElement fromDateInput = $(By.xpath("//div[text()='ПОДАЧА ЗАЯВОК']/following-sibling::div//input"));

    public SelenideElement toDateInput = $(By.xpath("//div[text()='ПОДАЧА ЗАЯВОК']//following-sibling::div/div[@class='form-group__cell-mdash']/following-sibling::div//input"));


}
