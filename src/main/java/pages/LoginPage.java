package pages;



import base.BaseFile;
import objRepo.objectRepo.LoginobjectRepo;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import static base.BaseFile.driver;

public class LoginPage extends BaseFile {

    public void verifyLogin() {
        launchDriver();
    }


    public void enteringData() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(LoginobjectRepo.userName).sendKeys(prop.getProperty("userName"));
        driver.findElement(LoginobjectRepo.password).sendKeys(prop.getProperty("password"));
        WebElement mainCap=  driver.findElement(LoginobjectRepo.capcha);
        WebElement sendCap= driver.findElement(LoginobjectRepo.Ent_captch);
        Thread.sleep(2000);
        sendCap.sendKeys(mainCap.getText().replace(" ",""));
        driver.findElement(LoginobjectRepo.submit).click();



    }
    }

