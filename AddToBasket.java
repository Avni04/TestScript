package HomeowrkAddtobasket;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class AddToBasket {
            WebDriver driver;
            @Test (priority = 1)
            void openBrowser() throws InterruptedException {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("https://demo.nopcommerce.com/");
                Thread.sleep(2000);
                driver.manage().window().maximize();
                System.out.println("user able to open browser");


                    driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
                    //Thread.sleep(1000);
                    System.out.println("user able to select computer");


                     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
                     Thread.sleep(1000);
                     System.out.println("user able to select Desktop");

                     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
                     Thread.sleep(2000);
                     System.out.println("user able to select item");

                     driver.findElement(By.id("add-to-cart-button-3")).click();
                     driver.findElement(By.id("topcartlink")).click();
                     Thread.sleep(2000);
                     System.out.println("user able to add to cart");

                     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).clear();
                     driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3");
                     Thread.sleep(1000);
                     System.out.println("user able to change quantity");

                     driver.findElement(By.id("updatecart")).click();
                     Thread.sleep(1000);
                     System.out.println("user able to update the cart");

                    driver.findElement(By.id("termsofservice")).click();
                    driver.findElement(By.id("checkout")).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
                    Thread.sleep(2000);
                    System.out.println("user able to checkout as guest");

            driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Yuvi");
            driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
            Thread.sleep(1000);
            driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Abc12@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("UnifyTesting");
            WebElement Country = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select"));
            Thread.sleep(2000);
            Select select = new Select(Country);
            select.selectByVisibleText("United Kingdom");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[7]/input")).sendKeys("Malvern");driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[8]/input")).sendKeys("Dhrish street");
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[10]/input")).sendKeys("AB1 4HB");
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[11]/input")).sendKeys("0781234567");
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")).click();
            Thread.sleep(1000);
                System.out.println("user able to successfully add shipping details");
                // By the time i have finished enetering the detail, the website updates and shows basket is empty so i cant move forward




}}
