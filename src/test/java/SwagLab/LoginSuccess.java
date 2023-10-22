package SwagLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSuccess {

    //test with Chrome
    @Test
    public void login_success(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //open login page
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        //check if is really in login page
        String loginPageAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");

        // insert username and pass
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //quit
        driver.close();
    }

    //test with EdgeBrowser
    @Test
    public void edge_login_success(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.edgedriver().setup();

        //apply chrome driver setup
        //open login page
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        //check if is really in login page
        String loginPageAssert = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");

        // insert username and pass
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //quit
        driver.close();
    }
}
