package pages.ShipmentPage;

import base.BaseFile;
import objRepo.objectRepo.GeneralObjectRepo;
import objRepo.objectRepo.SearchRepo.SearchRepo;
import objRepo.objectRepo.shipmentData.ShipmentRepoData;

public class ActionsPage extends BaseFile {

    public void map(){
        String shipmentID="ITD202404269941";
        driver.findElement(GeneralObjectRepo.globalSearch).click();
        driver.findElement(SearchRepo.loadId).sendKeys(shipmentID);
        driver.findElement(GeneralObjectRepo.gSearchbtn).click();


        driver.findElement(ShipmentRepoData.map).click();
        driver.findElement(ShipmentRepoData.shipmentLink).click();
        driver.findElement(ShipmentRepoData.addTowatch).click();
        driver.findElement(ShipmentRepoData.documents).click();




    }

}
