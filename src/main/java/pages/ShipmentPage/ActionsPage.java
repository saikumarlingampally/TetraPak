package pages.ShipmentPage;

import base.BaseFile;
import objRepo.objectRepo.GeneralObjectRepo;
import objRepo.objectRepo.SearchRepo.SearchRepo;
import objRepo.objectRepo.shipmentData.ShipmentActionsRepoData;
import org.openqa.selenium.WebElement;

public class ActionsPage extends BaseFile {

    public void map() throws InterruptedException {
        String shipmentID="TETRAPAK/OFPM.BS20240507-0058";
        driver.findElement(SearchRepo.globalSearch).click();
        Thread.sleep(2000);
        driver.findElement(SearchRepo.loadId).sendKeys(shipmentID);
        Thread.sleep(2000);
        driver.findElement(SearchRepo.gSearchbtn).click();
        Thread.sleep(2000);
    }
    public void clickMap() throws InterruptedException {
        driver.findElement(ShipmentActionsRepoData.map).click();
        Thread.sleep(2000);
        driver.findElement(GeneralObjectRepo.rightNav).click();
        Thread.sleep(5000);
        driver.findElement(GeneralObjectRepo.leftNav).click();

    }

    public void copyLink() throws InterruptedException {
        driver.findElement(ShipmentActionsRepoData.shipmentLink).click();
        Thread.sleep(2000);
       WebElement shipmentUrl= driver.findElement(ShipmentActionsRepoData.urlLink);
        System.out.println(shipmentUrl.getText());

    }

    public void addToWatch() throws InterruptedException {
        driver.findElement(ShipmentActionsRepoData.addTowatch).click();
        Thread.sleep(2000);

        driver.findElement(ShipmentActionsRepoData.confBtn).click();

    }

    public void viewDoc() throws InterruptedException {
        driver.findElement(ShipmentActionsRepoData.documents).click();
        Thread.sleep(2000);


    }




}
