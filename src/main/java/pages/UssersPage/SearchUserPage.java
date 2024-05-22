package pages.UssersPage;


import base.BaseFile;
import objRepo.objectRepo.Users.Userss;

public class SearchUserPage extends BaseFile {
    public void searchingUser(String value){
        driver.findElement(Userss.searchField).sendKeys(value);
        driver.findElement(Userss.searchBtn).click();




    }
}
