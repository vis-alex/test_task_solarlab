package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;


public class SearchResultPage {

    public SelenideElement loader = $x("//div[@class='loader']");

//    public void getElementFromPage() {
//        ElementsCollection  prices = $$x("//div[@itemprop='price']");
//
//        System.out.println(prices.size());
//        for (SelenideElement element : prices) {
//            System.out.println(element.getAttribute("content"));
//        }
//
//    }



    public void getElementFromPage() {
        ElementsCollection.SelenideElementIterable cardItems = $$x("//div[@class='card-item']").asDynamicIterable();
        Iterator<SelenideElement> iterator = cardItems.iterator();
//
//        while (!"display: none;".equals(loader.getAttribute("style"))) {
//        }

        while (iterator.hasNext()) {
            //находим значения начально цены для элемента закупки
            SelenideElement element = iterator.next();
            SelenideElement initialPrice = element.find("div[itemprop='price']");
            String pr = initialPrice.getAttribute("content");
            System.out.println(pr);

//             находим все Позиции закупки и вытаскиваем их количество
//             tr[@class='']
            SelenideElement tr = element.find("tr[class='']");
            System.out.println(tr);

            String s = "";
    }
    }

}
