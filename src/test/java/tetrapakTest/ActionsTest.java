package tetrapakTest;

import base.BaseFile;
import org.testng.annotations.Test;
import pages.ShipmentPage.ActionsPage;

public class ActionsTest extends BaseFile {
    @Test
    public void loginTest() throws InterruptedException {
        BaseFile baseFile= new BaseFile();
        baseFile.launchDriver();
        LoginTest loginTest= new LoginTest();
        loginTest.enteringData("adithya@thrymr.net","1234");
        ActionsPage actionsPage= new ActionsPage();
        actionsPage.searchShipment();
//        actionsPage.addToWatch();
        actionsPage.copyLink();
    }
}
