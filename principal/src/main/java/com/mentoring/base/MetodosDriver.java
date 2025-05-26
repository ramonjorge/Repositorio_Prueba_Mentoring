package com.mentoring.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MetodosDriver {
    private WebDriver driver;
    

    public WebDriver setUp() {
            ChromeOptions options = new ChromeOptions();
            // Desactivar headless para ver la ventana de Chrome
            options.addArguments("--headless=false");; // Asegúrate de que no está en modo headless
            options.addArguments("--enable-logging");   // Activa los logs de Chrome
            options.addArguments("--v=1");    // Establece el nivel de verbosidad de los logs  
            driver = new ChromeDriver(options);
            return driver;
            
        }


    public void searchCasaDelLibro(WebDriver driver){
        
        this.driver.get("https://www.lacasadellibro.com");

    }

    
}
