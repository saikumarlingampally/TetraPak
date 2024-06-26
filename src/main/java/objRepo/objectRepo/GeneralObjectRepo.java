package objRepo.objectRepo;

import base.BaseFile;
import org.openqa.selenium.By;



public class GeneralObjectRepo extends BaseFile {


    public static By mapView= By.xpath("(//*[@class='img img-fluid'])[1]");
    public static By tableView= By.xpath("(//*[@class='img img-fluid'])[2]");
    public static By rightNav=By.xpath("//i[@class='fa fa-chevron-right ng-star-inserted']");
    public static By leftNav=By.xpath("//i[@class='fa fa-chevron-left ng-star-inserted']");




    public static By user= By.xpath("(//a[contains(text(),'Users')])[1]");
    public static By manageRules= By.xpath("//*[contains(text(),'Manage Rules')]");
    public static By saveFilter= By.xpath("//*[contains(text(),'Saved Filter')]");
    public static By createGeo= By.xpath("//*[contains(text(),'Create Geofence')]");
    public static By userSettings= By.xpath("//*[contains(text(),'User Settings')]");
    public static By KpiReports= By.xpath("//*[contains(text(),'KPI Reports')]");
    public static By clearFilter= By.xpath("//*[contains(text(),'Clear Filter')]");




    public static By localSearch= By.xpath("//*[@name='search']");

    public static By logOutUser= By.xpath("//*[@id='bd-versions']");
    public static By logOutbtn= By.xpath(" //*[contains(text(),'Logout')]");

}
