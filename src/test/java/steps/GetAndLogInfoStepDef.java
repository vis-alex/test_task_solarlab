package steps;

import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j;
import pages.SearchResultPage;

@Log4j
public class GetAndLogInfoStepDef {
    private final SearchResultPage resultPage = new SearchResultPage();

    @Then("Get result info")
    public void getAndLogResultInfo() {
        log.info("Step - get result list of info and log it in file");
        resultPage.getElementFromPage();
        while(true) {
            String a = "";
        }
    }
}
