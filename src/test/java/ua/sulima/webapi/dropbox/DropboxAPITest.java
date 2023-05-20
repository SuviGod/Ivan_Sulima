package ua.sulima.webapi.dropbox;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import ua.sulima.webapi.factories.api.APIAbstractFactory;
import ua.sulima.webapi.factories.api.APIFactory;
import ua.sulima.webapi.model.Entry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@Slf4j
public class DropboxAPITest {
    private final DropboxAPI dropboxAPI;
    private final Path FILE_PATH;
    private final Path UPLOADED_FILE_PATH;

    private Optional<Entry> fileMetadata;

    public DropboxAPITest() {
        APIFactory apiFactory = APIAbstractFactory.getImpl1Instance();
        dropboxAPI = apiFactory.getDropboxAPI();
        FILE_PATH = Path.of("testFile.txt");
        UPLOADED_FILE_PATH = Path.of("uploadedTestFile.txt");
    }

    @Given("created file")
    public void createNewFile() {
        try {
            log.info("Creating a file");
            Files.write(FILE_PATH, "Glory to Ukraine".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(String.format("Failed to create the file: %s", e));
        }
    }

    @When("user uploads the file")
    public void uploadFileToDropbox() {
        log.info("Uploading the file");
        dropboxAPI.upload(FILE_PATH);
    }

    @Then("the file is uploaded on Dropbox")
    public void verifyFileUploading() {
        log.info("Verifying the file upload");
        List<Entry> entries = dropboxAPI.getFileList();

        for (Entry entry : entries) {
            if (entry.getName().equals(FILE_PATH.toString())) {
                return;
            }
        }
        log.error("Failed to get the file");
        throw new RuntimeException("Failed to get the file");
    }

    @And("user requests file's metadata")
    public void receiveFileMetadata() {
        log.info("Receiving the file metadata");
        fileMetadata = dropboxAPI.getFileMetadata(FILE_PATH);
    }

    @Then("user has got file's metadata")
    public void verifyFileMetadata(){
        log.info("Verifying of receiving the file metadata");
        if (fileMetadata.isEmpty()) {
            log.error("Failed to get the file metadata");
            throw new RuntimeException("Failed to get the file metadata");
        }
    }

    @And("user deletes the file")
    public void deleteFileFromDropbox() {
        log.info("Deleting the file");
        dropboxAPI.delete(FILE_PATH);
    }

    @Then("The file is deleted from Dropbox")
    public void verifyFileExtraction() {
        log.info("Verifying the file extraction");
        boolean success = dropboxAPI.download(FILE_PATH, UPLOADED_FILE_PATH);
        if (success){
            log.error("Failed to delete the file");
            throw new RuntimeException("Failed to delete the file");
        }
    }

    @After
    @SneakyThrows
    public void finalizeDropbox(){
        log.info("Cleaning workspace up");
        Files.deleteIfExists(FILE_PATH);
        Files.deleteIfExists(UPLOADED_FILE_PATH);
    }
}
