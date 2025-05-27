package com.test.selenium.margaux;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/margaux.arguellesalo/Desktop/Proyecto Automatización/chromedriver-win64/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.casadellibro.com");
        System.out.println("Title: "+ driver.getTitle());
        driver.quit();
    }
}
