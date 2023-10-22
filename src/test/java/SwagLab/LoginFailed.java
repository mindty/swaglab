package SwagLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailed{
    //fail case1: Username and password do not match any user in this service

    //test with Chrome
    @Test
    public void login_failed(){
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
        driver.findElement(By.id("user-name")).sendKeys("be_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //check if there's an alert
        String loginAlert = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        System.out.println(loginAlert);
        Assert.assertEquals(loginAlert, "Epic sadface: Username and password do not match any user in this service");

        //quit
        driver.close();
    }

    //test with EdgeBrowser
    @Test
    public void edge_login_failed(){
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
        driver.findElement(By.id("user-name")).sendKeys("be_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //check if there's an alert
        String loginAlert = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        System.out.println(loginAlert);
        Assert.assertEquals(loginAlert, "Epic sadface: Username and password do not match any user in this service");

        //quit
        driver.close();
    }

    //fail case2: user has been locked out.
    //test with Chrome
    @Test
    public void login_failed2(){
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
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //check if there's an alert
        String loginAlert = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        System.out.println(loginAlert);
        Assert.assertEquals(loginAlert, "Epic sadface: Sorry, this user has been locked out.");

        //quit
        driver.close();
    }

    //test with EdgeBrowser
    @Test
    public void edge_login_failed2(){
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
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //check if there's an alert
        String loginAlert = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        System.out.println(loginAlert);
        Assert.assertEquals(loginAlert, "Epic sadface: Sorry, this user has been locked out.");

        //quit
        driver.close();
    }
}
