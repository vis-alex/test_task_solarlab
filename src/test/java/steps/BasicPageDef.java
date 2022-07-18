package steps;

import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j;
import pages.BasePage;

@Log4j
public class BasicPageDef {
    BasePage basePage = new BasePage();
    @Then("Click {string} link")
    public void clickLink(String link) {
        log.info("Step - click teg a with href: " + link);
        basePage.clickAByHref(link);
    }

    @Then("Click {string} button")
    public void clickClose(String text) {
        basePage.clickDivByClass(text);
    }
}
