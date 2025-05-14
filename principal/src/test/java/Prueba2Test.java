
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prueba2Test {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=false"); // Para ver el navegador en acción
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // 1. Ir a la página principal de Google
        driver.get("https://www.google.com");

        // 2. Aceptar cookies si aparece el banner (Google a veces muestra uno en Europa)
        try {
            WebElement acceptCookiesButton = driver.findElement(By.xpath("//button/div[normalize-space()='Aceptar todo']"));
            acceptCookiesButton.click();
        } catch (Exception e) {
            System.out.println("No apareció el banner de cookies.");
        }

        // 3. Localizar el cuadro de búsqueda
        WebElement searchBox = driver.findElement(By.name("q"));

        // 4. Escribir una búsqueda
        searchBox.sendKeys("Selenium WebDriver");

        // 5. Enviar la búsqueda
        searchBox.submit();

        // 6. Esperar un momento para que carguen los resultados
        try {
            Thread.sleep(10000); // NOTA: Esto es solo para este ejemplo. Idealmente deberías usar WebDriverWait.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 8. Clickar en check "No soy un Robot"


        // 7. Verificar que hay resultados relevantes
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
