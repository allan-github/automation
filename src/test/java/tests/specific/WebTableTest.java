package tests.specific;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HtmlTableSteps;

@RunWith(SerenityRunner.class)
public class WebTableTest {

    @Managed(driver="chrome")
    WebDriver browser;

    @Steps
    HtmlTableSteps htmlTableSteps;

    @Test
    public void getTableRowCount() throws Exception {
        htmlTableSteps.isOnTheHomePage();
        htmlTableSteps.thenVerifyTableRowCount();
        htmlTableSteps.thenVerifyTableColumnCount();
        htmlTableSteps.thenVerifyCellValue();
        htmlTableSteps.thenVerifyTableRow();
    }
}
