package objRepo.objectRepo.SearchRepo;

import org.openqa.selenium.By;

public class SearchRepo {


    public static By globalSearch= By.xpath("(//*[@class='img img-fluid'])[3]");


    public static By domain = By.xpath("//input[@placeholder=\"Enter Domain\"]");
    public static By containerId = By.xpath("//input[@placeholder=\"Enter Container ID\"]");
    public static By loadId = By.xpath("//input[@placeholder=\"Enter Load ID\"]");
    public static By CarrierName = By.xpath("//input[@placeholder=\"Enter Carrier Name\"]");
    public static By shipFrom = By.xpath("(//*[contains(text(),'Ship From')])[1]");









    public static By gSearchbtn= By.xpath("//*[contains(text(),'Search')]");
}
