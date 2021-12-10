package ru.appline.tests.simple.temp;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class TempFolderTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {
        File createdFile = tempFolder.newFile("myfile.txt");
        File createdFolder = tempFolder.newFolder("subfolder");
    }

    @Test
    public void testWrite() throws IOException {
        // Create a temporary file.
        final File tempFile = tempFolder.newFile("tempFile.txt");

        // Write something to it.
        FileUtils.writeStringToFile(tempFile, "hello world", Charset.defaultCharset(), false);

        // Read it from temp file
        final String s = FileUtils.readFileToString(tempFile, Charset.defaultCharset());

        // Verify the content
        Assert.assertEquals("hello world", s);

        //Note: File is guaranteed to be deleted after the test finishes.
    }


}
