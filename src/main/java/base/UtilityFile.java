package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class UtilityFile extends BaseFile{

        public void selectDrop(WebElement element, String value) {
            Select drop = new Select(element);
            drop.selectByVisibleText(value);


        }

        public void screenShot() {
            TakesScreenshot sc = ((TakesScreenshot) driver);
            File srcfile = sc.getScreenshotAs(OutputType.FILE);
        }
        public void readFile() {
        }

        public void movetoelement(WebDriver driver, WebElement element) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
        }

        public void waitelement(){
//            WebDriverWait wait= new WebDriverWait();

        }


    }


