package objRepo.objectRepo.Users;

import org.openqa.selenium.By;

import java.Base.BaseFile;

public class Userss extends BaseFile {
    public static By subAdmin= By.xpath("//a[contains(text(),' Sub Admin')]");
    public static By pc= By.xpath("//a[contains(text(),'Users ')]");

    public static By searchField= By.xpath("//*[@placeholder='Search']");
    public static By searchBtn= By.xpath("//button[contains(text(),' Search ')]");
    public static By addUserbtn= By.xpath("//*[contains(text(),'+Add User')]");


    //Adding User
    public static By cancelicon= By.xpath("");
    public static By fname= By.xpath("//input[@placeholder='First Name']");
    public static By lname= By.xpath("//input[@placeholder='Last Name']");
    public static By eMail= By.xpath("//input[@placeholder='Email']");
    public static By pwd= By.xpath("//input[@formcontrolname='password']");
    public static By cpwd= By.xpath("//input[@formcontrolname='confirmPassword']");
    public static By distance= By.xpath("//select[@formcontrolname='distanceUnit']");
    public static By temp= By.xpath("//select[@formcontrolname='temperatureUnit']");
    public static By pNumber= By.xpath("//input[@formcontrolname='phone1']");
    public static By uRole= By.xpath("//select[@formcontrolname='role']");
    public static By language= By.xpath("//select[@formcontrolname='preferredLanguage']");
    public static By baseContMap= By.xpath("//select[@formcontrolname='baseMapCountry']");
    public static By registerbtn= By.xpath("//*[contains(text(),'Register')]");
    public static By cancelbtn= By.xpath("(//*[contains(text(),'Cancel')])[2]");
    public static By locations= By.xpath("//ul[@class='ui-autocomplete-multiple-container ui-widget ui-inputtext ui-state-default ui-corner-all ng-tns-c98-7 ng-star-inserted']");


   public static By modifyUser=By.xpath("//*[@class='fa fa-edit']");
    public static By deleteUser=By.xpath("//*[@class='fa fa-trash']");
}
