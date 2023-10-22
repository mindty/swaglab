package SwagLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckOutItem {
    //test with Chrome
    @Test
    public void checkout_item(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //open login page
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        // insert username and pass
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //check if already in Product page
        String productPage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(productPage, "Products");

        //add 1 item to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        //check if item already in cart
        String addItem = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
        Assert.assertEquals(addItem, "Remove");

        //click cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //check if already in Cart page
        String cartPage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(cartPage, "Your Cart");

        //checkout item
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        //check if already in Checkout info
        String checkoutInfo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(checkoutInfo, "Checkout: Your Information");

        // insert firstname, lastname and zip code
        driver.findElement(By.id("first-name")).sendKeys("chany");
        driver.findElement(By.id("last-name")).sendKeys("rizqina");
        driver.findElement(By.id("postal-code")).sendKeys("123456");
        //click button continue
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();


        //check if already in Checkout Overview
        String checkoutOverview = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(checkoutOverview, "Checkout: Overview");
        //click button finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

        //check if CheckOut Finish
        String checkoutFinish = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(checkoutFinish, "Checkout: Complete!");

        //quit
        driver.close();
    }

    //test with EdgeBrowser
    @Test
    public void edge_checkout_item(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.edgedriver().setup();

        //apply chrome driver setup
        //open login page
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        // insert username and pass
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click button login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        //check if already in Product page
        String productPage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(productPage, "Products");

        //add 1 item to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        //check if item already in cart
        String addItem = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
        Assert.assertEquals(addItem, "Remove");

        //click cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //check if already in Cart page
        String cartPage = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(cartPage, "Your Cart");

        //checkout item
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        //check if already in Checkout info
        String checkoutInfo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(checkoutInfo, "Checkout: Your Information");

        // insert firstname, lastname and zip code
        driver.findElement(By.id("first-name")).sendKeys("chany");
        driver.findElement(By.id("last-name")).sendKeys("rizqina");
        driver.findElement(By.id("postal-code")).sendKeys("123456");
        //click button continue
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();


        //check if already in Checkout Overview
        String checkoutOverview = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(checkoutOverview, "Checkout: Overview");
        //click button finish
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

        //check if CheckOut Finish
        String checkoutFinish = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(checkoutFinish, "Checkout: Complete!");

        //quit
        driver.close();
    }
}
