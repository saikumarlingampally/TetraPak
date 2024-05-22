package objRepo.objectRepo;

import base.BaseFile;
import org.openqa.selenium.By;

public class LoginobjectRepo extends BaseFile {
    public static By userName=By.xpath("//input[@name='userId']");
    public static By password=By.xpath("//input[@name='password']");
    public static By encryptbtn= By.xpath("//span[@toggle=\"#password-field\"]");
    public static By capcha=By.xpath("//*[@id='maincaptcha']");
    public static By Ent_captch=By.xpath("//input[@id='captchainputfield']");
    public static By submit=By.xpath("(//button[contains(text(),' Login ')])[1]");

}
