package SwagLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DetailProduct {
    //test with Chrome
    @Test
    public void detail_product(){
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

        //click item
        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();

        //check if already in Detail Item page
        String detailPage = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).getText();
        Assert.assertEquals(detailPage, "Back to products");

        //quit
        driver.close();
    }

    //test with EdgeBrowser
    @Test
    public void edge_detail_product(){
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

        //click item
        driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();

        //check if already in Detail Item page
        String detailPage = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).getText();
        Assert.assertEquals(detailPage, "Back to products");

        //quit
        driver.close();
    }
}
