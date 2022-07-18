package steps;

import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j;
import pages.BasePage;
import pages.SearchPage;

@Log4j
public class SearchStepDef {
    private final BasePage basePage = new BasePage();

    private final SearchPage searchPage = new SearchPage();

    @Then("Click {string} settings")
    public void click(String text) {
        log.info("Step - click div element in the page with text: " + text);
        basePage.clickDivByClass(text);
    }

    @Then("Click {string} checkbox")
    public void clickCheckBox(String text) {
        log.info(" Step - click label element in the page with text: " + text);
        basePage.clickLabel(text);
    }

    @Then("Filter dates")
    public void filterFromTo() {
        log.info("Step - Filtering dates from current date to current date");
        searchPage.filterByDatesDiv.click();

        searchPage.fromDateInput.click();
        searchPage.fromDateInput.pressEnter();

        searchPage.toDateInput.click();
        searchPage.toDateInput.pressEnter();
    }

    @Then("Set {string} region")
    public void setRegion(String text) {
        log.info("Step - set region: " + text);
        basePage.clickDivByText(SearchPage.DELIVERY_REGION);
        basePage.clickLabel(text);
        basePage.clickButtonByText(SearchPage.FIND_BUTTON);
    }
}
