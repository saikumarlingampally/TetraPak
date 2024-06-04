package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseFile {
        public static WebDriver driver;
        public static Properties prop=new Properties();
        public static UtilityFile ut= new UtilityFile();


        public BaseFile(){
            try{
                String confit="/home/thrymr/Projects/SaiKumar_Lingampally/Auto/TetraPak/src/config/config.properties";
                FileInputStream file= new FileInputStream(confit);
                prop.load(file);
            }catch (FileNotFoundException e){
                e.printStackTrace();


            }catch (IOException e){
                e.printStackTrace();
            }
        }
        public void launchDriver(){
            String launcher= prop.getProperty("browser");
            if (launcher.equals("chrome")){
                driver= new ChromeDriver();
                System.out.println("launching Chrome Driver");
            }else if (launcher.equals("firefox")){
                driver= new FirefoxDriver();
                System.out.println("launching fireFox Driver");
            }
            ChromeOptions options = new ChromeOptions();
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));

        }
}




