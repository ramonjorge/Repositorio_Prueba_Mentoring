
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prueba3Test {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=false"); // Queremos ver el navegador actuando
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
        driver = new ChromeDriver();
    }

    @Test
    public void testDuckDuckGoSearch() {
        // 1. Abrir DuckDuckGo
        driver.get("https://duckduckgo.com/");

        // 2. Localizar el cuadro de búsqueda
        WebElement searchBox = driver.findElement(By.name("q"));

        // 3. Escribir el término de búsqueda
        searchBox.sendKeys("Selenium WebDriver");

        // 4. Enviar la búsqueda
        searchBox.submit();

        // 5. Esperar para que carguen los resultados
        try {
            Thread.sleep(2000); // Pausa de 2 segundos (idealmente usaríamos WebDriverWait)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 6. Verificar que la página contiene "Selenium WebDriver"
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("Selenium WebDriver"), "El contenido no contiene 'Selenium WebDriver'");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
