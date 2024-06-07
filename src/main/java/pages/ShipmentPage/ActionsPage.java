package pages.ShipmentPage;

import base.BaseFile;
import objRepo.objectRepo.GeneralObjectRepo;
import objRepo.objectRepo.SearchRepo.SearchRepo;
import objRepo.objectRepo.shipmentData.ShipmentActionsRepoData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsPage extends BaseFile {

    public void searchShipment() throws InterruptedException {
        String shipmentID = "BS20240507-0058";
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
        WebElement shipmentUrl = driver.findElement(ShipmentActionsRepoData.urlLink);
        System.out.println(shipmentUrl.toString());
        String tntURlforNewTab = shipmentUrl.getText();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(tntURlforNewTab);

    }

    public void addToWatch() throws InterruptedException {
        Boolean gray = driver.findElement(ShipmentActionsRepoData.addtoWatchFalse).isDisplayed();
        System.out.println("..............."+gray);

        if (gray) {
            Thread.sleep(3000);
            driver.findElement(ShipmentActionsRepoData.addTowatch).click();
            Thread.sleep(2000);
            driver.findElement(ShipmentActionsRepoData.confBtn).click();

        } else   {
            System.out.println("Shipment added to Watchlist");

        }
        driver.findElement(GeneralObjectRepo.clearFilter).click();
    }


    public void viewDoc() throws InterruptedException {
        driver.findElement(ShipmentActionsRepoData.documents).click();
        Thread.sleep(2000);
        driver.findElement(ShipmentActionsRepoData.closeDoc).click();


    }
}




