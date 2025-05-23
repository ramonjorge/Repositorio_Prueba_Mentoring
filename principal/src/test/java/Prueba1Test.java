
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prueba1Test {

        WebDriver driver;
    
        @BeforeEach
        public void setUp() {
            ChromeOptions options = new ChromeOptions();
            // Desactivar headless para ver la ventana de Chrome
            options.addArguments("--headless=false");; // Asegúrate de que no está en modo headless
            options.addArguments("--enable-logging");   // Activa los logs de Chrome
            options.addArguments("--v=1");    // Establece el nivel de verbosidad de los logs  
            driver = new ChromeDriver();
        }
    
        @Test
        public void testGoogleTitle() {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            assertTrue(title.contains("Google"));
            System.out.println(title);
        }
    
        @AfterEach
        public void tearDown() {
            driver.quit();
        }
        
}
