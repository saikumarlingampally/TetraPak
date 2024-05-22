package pages.UssersPage;


import base.BaseFile;
import objRepo.objectRepo.GeneralObjectRepo;
import objRepo.objectRepo.Users.Userss;
import org.openqa.selenium.WebElement;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddSubAdminPage extends BaseFile {


    public void addingUserPage() throws InterruptedException {


        Thread.sleep(5000);
        driver.findElement(GeneralObjectRepo.user).click();
        Thread.sleep(2000);
        driver.findElement(Userss.addUserbtn).click();
        Thread.sleep(2000);
        driver.findElement(Userss.fname).sendKeys("kumar");
        driver.findElement(Userss.lname).sendKeys("kumar");
        driver.findElement(Userss.eMail).sendKeys("kumar@gmail.com");

        driver.findElement(Userss.pwd).sendKeys("1234");
        driver.findElement(Userss.cpwd).sendKeys("1234");

        if (Userss.pwd.equals(Userss.cpwd)){
            System.out.println("Ok");

        }else{
            System.out.println(" Password Do Not Match. ");
        }

        Thread.sleep(2000);
        WebElement km= driver.findElement(Userss.distance);
        Thread.sleep(2000);
        ut.selectDrop(km,"Meters ");
        WebElement temp= driver.findElement(Userss.temp);

        Thread.sleep(2000);
        ut.selectDrop(temp,"Fahrenheit (°F) ");
       WebElement mobileNumberInput= driver.findElement(Userss.pNumber);
       mobileNumberInput.sendKeys("7845213625");
       String mobileNumber= mobileNumberInput.getAttribute("type");
        System.out.println(mobileNumberInput.getAttribute("type"));
       String mobileError="Invalid mobile number";
        String regexPattern = "\\d{10}";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(mobileNumber);

        // Check if the mobile number matches the pattern
        if (matcher.matches()) {
            System.out.println("Phone Number is valid " + mobileNumber);
        } else {
            System.out.println("Phone Number not valid " + mobileNumber);
        }



        WebElement userRole= driver.findElement(Userss.uRole);
        ut.selectDrop(userRole, "Sub Admin ");
        WebElement language= driver.findElement(Userss.language);
        ut.selectDrop(language,"English ");
        ut.movetoelement(driver, language);
        WebElement baseMap= driver.findElement(Userss.baseContMap);
        ut.selectDrop(baseMap,"Sweden ");
        ut.movetoelement(driver, baseMap);
       WebElement createdSuccessfully= driver.findElement(Userss.registerbtn);
       createdSuccessfully.click();
       String exp="User created successfully";

       if (createdSuccessfully.equals(exp)){
           System.out.println("user registered successfully");
       }else {
           System.out.println("user not registered successfully");
       }





    }


}
