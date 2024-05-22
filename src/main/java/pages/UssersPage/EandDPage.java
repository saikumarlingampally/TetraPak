package pages.UssersPage;


import base.BaseFile;
import base.UtilityFile;
import objRepo.objectRepo.Users.Userss;
import org.openqa.selenium.WebElement;


public class EandDPage extends BaseFile {
    UtilityFile util= new UtilityFile();

    public void deleteUser(){
        driver.findElement(Userss.deleteUser).click();

    }

    public void editUser(){
        driver.findElement(Userss.modifyUser).click();

        driver.findElement(Userss.fname).sendKeys("balaji");
        driver.findElement(Userss.lname).sendKeys("test");
        driver.findElement(Userss.eMail).sendKeys("balaji@gmail.com");
        driver.findElement(Userss.pwd).sendKeys("1234");
        driver.findElement(Userss.cpwd).sendKeys("1234");
        WebElement km= driver.findElement(Userss.distance);
        util.selectDrop(km,"Meters ");
        WebElement temp= driver.findElement(Userss.temp);
        util.selectDrop(temp,"Fahrenheit (°F) ");
        driver.findElement(Userss.pNumber).sendKeys("76541254877");
        //Role
        WebElement userRole= driver.findElement(Userss.uRole);
        util.selectDrop(userRole, "Planner ");
        WebElement language= driver.findElement(Userss.language);
        util.selectDrop(language,"English ");
        WebElement baseMap= driver.findElement(Userss.baseContMap);
        util.selectDrop(baseMap,"Sweden ");

        WebElement entLocations= driver.findElement(Userss.locations);
        entLocations.click();
        entLocations.sendKeys("hyderabad");




        driver.findElement(Userss.registerbtn).click();

    }
}
