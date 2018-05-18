package pages.support;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HtmlTableSupport extends PageObject {

    public static int rowCount(WebElement table) {
        List rows = table.findElements(By.xpath("//tr"));
        System.out.println("Rows: "  + rows.size());
        return rows.size();
    }

    public static int columnCount(WebElement table) {
        List cols = table.findElements(By.xpath("//th"));
        System.out.println("Cols: "  + cols.size());
        return cols.size();
    }

    public static String cellValue(WebElement table, int row, int column) {
        WebElement cell = table.findElement(By.xpath("//tr[" + row + "]/td[" + column + "]"));
        String value = cell.getText();
        System.out.println("cellValue: " + value);
        return value;
    }

    public static String tableRow(WebElement table, int row) {
        WebElement tableRow = table.findElement(By.xpath("//tr[" + row + "]"));
        String rowText = tableRow.getText();
        System.out.println("tableRow: " + rowText);
        return rowText;
    }


}
