package pages.objects;

import net.thucydides.core.pages.PageObject;

public class IndexPage extends PageObject {

    public int rowCount() {
        // This should be the number of rows for the index table
        return 5;
    }


    public String getName(int row) {
        return "Name " + row;
    }

    public String getNumber(int row) {
        return "Number " + row;
    }
}
