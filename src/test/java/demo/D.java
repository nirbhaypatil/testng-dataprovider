package demo;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class D {

    FirefoxDriver driver;
    @BeforeTest
    public void m1(){
        driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/");

    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("inside before suite method");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("inside after suite method");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


    public void testMethod(){}
}
