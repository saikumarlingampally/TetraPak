package tetrapakTest;

import base.BaseFile;
import objRepo.objectRepo.LoginobjectRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseFile {


    @Test (dataProvider = "validate_User")
    public void enteringData (String Uname, String password) throws InterruptedException {

    BaseFile baseFile = new BaseFile();
    baseFile.launchDriver();

        driver.findElement(LoginobjectRepo.userName).sendKeys(Uname);
        driver.findElement(LoginobjectRepo.password).sendKeys(password);
        WebElement mainCap = driver.findElement(LoginobjectRepo.capcha);
        WebElement sendCap = driver.findElement(LoginobjectRepo.Ent_captch);

        sendCap.sendKeys(mainCap.getText().replace(" ", ""));

        driver.findElement(LoginobjectRepo.submit).click();
        Thread.sleep(3000);



        String actual= driver.getCurrentUrl();
        System.out.println(actual);

        String expected="http://13.212.31.37:9065/mapview/vehicle";

        if (actual.equals(expected))
        {
            System.out.println("Valid User");
        }else {
            System.out.println("Invalid User");
        }

    }

    @DataProvider(name ="validate_User")
    public Object[][] loginData(){

        Object[][] data = new Object[7][2];

        data[0][0]=" ";
        data[0][1]=" ";

        data[1][0]="adithya@thrymr.net";
        data[1][1]="";


        data[2][0]="";
        data[2][1]="1234";

        data[3][0]="adithya@thrymr.net";
        data[3][1]="12345";

        data[4][0]="adithya123@thrymr.net";
        data[4][1]="1234";

        data[5][0]="adithya123@thrymr.net";
        data[5][1]="12345";

        data[6][0]="suresh.nair@inspirage.com";
        data[6][1]="1234";

        return data;


    }
}
