package framework.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import framework.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {
    private final static String NAME = "File Upload";
    private final By CHOOSE_FILE = By.id("file-upload");
    private final By FILE_SUBMIT = By.id("file-submit");
    private ITextBox fileNameInput = AqualityServices.getElementFactory().getTextBox(CHOOSE_FILE, "Upload");
    private IButton fileSubmitBtn = AqualityServices.getElementFactory().getButton(FILE_SUBMIT, "Submit file");
    public FileUploadPage(){
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)),NAME);
    }
    public void uploadFile(String filename){
        fileNameInput.clearAndType(filename);
    }

    public void clickSubmitBtn(){
        fileSubmitBtn.click();
    }
}
