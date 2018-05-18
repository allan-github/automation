package pages.objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static pages.support.HtmlTableSupport.*;


public class TablePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"countries\"]/tbody")
    private WebElement table;

    public int getTableRowCount() {
        return rowCount(table);
    }

    public int getTableColumnCount() {
        return columnCount(table);
    }

    public String getCellValue(int row, int col) {
        return cellValue(table, row, col);
    }

    public String getTableRow(int row) {
        return tableRow(table ,3);
    }
}
