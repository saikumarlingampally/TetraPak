package pages.UssersPage;



import base.BaseFile;
import objRepo.objectRepo.Users.Userss;
import org.openqa.selenium.WebElement;


public class AddCustomerPage extends BaseFile {

    public void addPlanner(){

        driver.findElement(Userss.fname).sendKeys("balaji");
        driver.findElement(Userss.lname).sendKeys("test");
        driver.findElement(Userss.eMail).sendKeys("balaji@gmail.com");
        driver.findElement(Userss.pwd).sendKeys("1234");
        driver.findElement(Userss.cpwd).sendKeys("1234");
        WebElement km= driver.findElement(Userss.distance);
        ut.selectDrop(km,"Meters ");
        WebElement temp= driver.findElement(Userss.temp);
        ut.selectDrop(temp,"Fahrenheit (°F) ");
        driver.findElement(Userss.pNumber).sendKeys("76541254877");
        WebElement userRole= driver.findElement(Userss.uRole);
        ut.selectDrop(userRole, "Planner ");
        WebElement language= driver.findElement(Userss.language);
        ut.selectDrop(language,"English ");
        WebElement baseMap= driver.findElement(Userss.baseContMap);
        ut.selectDrop(baseMap,"Sweden ");

        WebElement entLocations= driver.findElement(Userss.locations);
        entLocations.click();
        entLocations.sendKeys("hyderabad");

        driver.findElement(Userss.registerbtn).click();

    }


}
