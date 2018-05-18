package tests.designs;

import org.junit.Test;

import java.io.File;


public class DesignVerificationTest {

    @Test
    public void verifyResourceAbsolutePath() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("data/csv/sample.csv").getFile());
        System.out.println("Absolute Path: [" + file.getAbsolutePath() + "]");
    }

}

