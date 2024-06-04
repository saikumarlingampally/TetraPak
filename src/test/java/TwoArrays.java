import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoArrays {

    @Test(dataProvider="userData")
    public void login(String userName, String pass)throws Throwable{
//        WebDriver driver= new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://13.212.31.37:9065/login");
//
//       driver.findElement(By.name("userId")).sendKeys(userName);
//        driver.findElement(By.name("password")).sendKeys(pass);
//        Thread.sleep(200);
//        driver.findElement(By.xpath("(//button[contains(text(),' Login ')])[1]")).click();



        System.out.println(userName);
        System.out.println(pass);

    }
    @DataProvider(name="loginData")
        public Object[][] loginData() {
        Object[][] data= new Object[4][2];

        data[0][0]="suresh.nair@inspirage.com";
        data[0][1]="01asdf23";

        data[1][0]="suresh.nairinspirage.com";
        data[1][1]="1asdf234";

        data[2][0]="suresh.nairinspirage.com";
        data[2][1]="1asdf234";

        data[3][0]="suresh.nairinspirage.com";
        data[3][1]="1asdf234";




        return data;

    }

    @DataProvider(name="userData")
    public Object[][] userdata() {
        return new Object[][]
                {

                        {"user1","pwd01"},
                        {"user2","pwd02"},
                        {"user3","pwd03"}
                };
    }








    }

