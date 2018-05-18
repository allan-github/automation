package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.objects.TablePage;
import pages.common.HomePage;


public class HtmlTableSteps {

    HomePage homePage;
    TablePage tablePage;

    @Step
    public void isOnTheHomePage() {
        homePage.open();
    }

    @Step
    public void thenVerifyTableRowCount() {
        int actual = tablePage.getTableRowCount();
        int expected = 248;
        Assert.assertEquals(expected, actual);
    }

    @Step
    public void thenVerifyTableColumnCount() {
        int actual = tablePage.getTableColumnCount();
        //int expected = 248;
        //Assert.assertEquals(expected, actual);
    }

    @Step
    public void thenVerifyCellValue() {
        String actual = tablePage.getCellValue(10, 3);
        //int expected = 248;
        //Assert.assertEquals(expected, actual);
    }

    @Step
    public void thenVerifyTableRow() {
        String actual = tablePage.getTableRow(20);
        //int expected = 248;
        //Assert.assertEquals(expected, actual);
    }
}
