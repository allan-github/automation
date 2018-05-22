package pages.objects;

import net.thucydides.core.pages.PageObject;

public class SectionPage extends PageObject {

    public int rowCount() {
        // This should be the number of rows for the section table
        return 5;
    }

    public String getTitle(int row) {
        // You should extract the Title here
        return "Section " + row;
    }

    public String getGuid(int row) {
        // You should extract the GUID here
        return "Guid " + row;
    }


}
