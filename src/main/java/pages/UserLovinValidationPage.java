package pages;
import base.BaseFile;
import objRepo.objectRepo.LoginobjectRepo;
import org.openqa.selenium.WebElement;
import java.time.LocalTime;


public class UserLovinValidationPage extends BaseFile {
    public void validUser() throws InterruptedException {

        WebElement user=  driver.findElement(LoginobjectRepo.userName);
        user.sendKeys(prop.getProperty("userName"));

        driver.findElement(LoginobjectRepo.password).sendKeys(prop.getProperty("password"));
        driver.findElement(LoginobjectRepo.encryptbtn).click();
        WebElement mainCap=  driver.findElement(LoginobjectRepo.capcha);
        WebElement sendCap= driver.findElement(LoginobjectRepo.Ent_captch);
        Thread.sleep(2000);
        sendCap.sendKeys(mainCap.getText().replace(" ",""));
        driver.findElement(LoginobjectRepo.submit).click();
        Thread.sleep(2000);

        LocalTime time= LocalTime.now();
        System.out.println(time);

        String ext= driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        String act="http://13.212.31.37:9063/mapview/vehicle";


        if(act.equals(ext)){
            System.out.println("Login successfully");

        }else {
            System.out.println("Login Unsuccessfully");
        }



    }
    public void  negativelogin(){

    }

}
