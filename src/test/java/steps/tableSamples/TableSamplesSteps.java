package steps.tableSamples;


import net.thucydides.core.annotations.Step;
import models.DocumentModel;
import org.junit.Assert;
import pages.objects.DocumentPage;
import pages.objects.IndexPage;
import pages.objects.SectionPage;

import java.util.ArrayList;

public class TableSamplesSteps {

    SectionPage sectionPage;
    DocumentPage documentPage;
    IndexPage indexPage;

    // You should place each of the sections in this method into local private methods to make it tidier
    // simply putting together here so you can see flow easier as per discussion

    @Step
    public void verifySectionFilesWithIndexFiles() {

        // Get the number of rows from section
        int sectionRowCount = sectionPage.rowCount();
        ArrayList<DocumentModel> sectionArrayList = new ArrayList<DocumentModel>();

        // Collect data for each document in section
        for (int row = 0; row < sectionRowCount; row++) {
            String sectionTitle = sectionPage.getTitle(row);
            String guid = sectionPage.getGuid(row);

            sectionArrayList = getSectionDocuments(sectionTitle, guid, sectionArrayList);

        }

        // FUNCTION: Repeat for Index here
        int indexRowCount = indexPage.rowCount();
        ArrayList<DocumentModel> indexArrayList = new ArrayList<DocumentModel>();

        // repeat above logic here
        // ....


        // FUNCTION: Now pass both arrays into function to do the assertion
        // You would expect the number of documents to be the same
        assertSectionAndIndexDocumentsAreTheSame(sectionArrayList,indexArrayList);

    }

    private ArrayList<DocumentModel> getSectionDocuments(String title, String guid, ArrayList<DocumentModel> documentModelArrayList) {
        // Navigate to the document
        documentPage.clickViewDocuments(guid);

        // Get number of documents
        int documentRowCount = documentPage.rowCount();


        for (int documentRow = 0; documentRow < documentRowCount; documentRow++) {
            DocumentModel documentModel = new DocumentModel();

            documentModel.setTitle(title);
            documentModel.setGuid(guid);
            documentModel.setDocumentName( documentPage.getName(documentRow));
            documentModel.setNumber(documentPage.getNumber(documentRow));
            documentModelArrayList.add(documentModel);
        }

        return documentModelArrayList;
    }

    private void assertSectionAndIndexDocumentsAreTheSame(ArrayList<DocumentModel> section, ArrayList<DocumentModel> index) {
        for (int sectionCount = 0; sectionCount < section.size(); sectionCount++) {
            for (int indexCount = 0; indexCount < index.size(); indexCount++) {
                // Find / compare here, execute Assert false if not found
            }
        }

        Assert.assertTrue(true);

    }

}
