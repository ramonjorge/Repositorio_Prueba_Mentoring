package com.test.selenium.margaux.Pages;
import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;


    public class CookiesPage {
        public static void main(String[]args){
            System.setProperty("webdriver.chrome.driver", "C:/Users/margaux.arguellesalo/Desktop/Proyecto Automatización/chromedriver-win64/chromedriver.exe/");
            WebDriver driver = new ChromeDriver();

            //Abrir página web
            driver.get("https://www.casadellibro.com/");

            //Lista de Elementos
            WebElement DrawerCookies = driver.findElement(By.xpath("//@div[id='onetrust-group-container']"));
            WebElement PoliticaDePrivacidad = driver.findElement(By.xpath("//p[@id='onetrust-policy-text']//a[@href='https://www.casadellibro.com/politica-cookies\']"));
            WebElement BotonConfigurarCookies = driver.findElement(By.xpath("//button[@id='onetrust-pc-btn-handler']"));
            WebElement BotonRechazarCookies = driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']"));
            WebElement BotonAceptarCookies = driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']"));

            // Métodos necesarios:
            /*Comprobar que se ha abierto el drawer
             *Hacer clic en la Politica de Cookies
             *Hacer clic en el botón de Configurar Cookies
             *Hacer clic en más Información de Su privacidad
             *Hacer clic en la pestaña Cookies técnicas
             *Hacer clic en la pestaña Cookies de preferencias o personalización
             *Activar el switch de Aceptar
             *Hacer clic en la pestaña Cookies de Análisis o medición
             *Activar el switch de Aceptar
             *Hacer clic en la pestaña Cookies publicitarias
             *Activar el switch de Aceptar             
             *Hacer clic en la pestaña Cookies de publicidad comportamental
             *Activar el switch de Aceptar
             *Hacer clic en el botón Confirmar mis preferencias
             *Hacer clic en el botón Rechazarlas todas
             *Hacer clic en el botón Permitir Todas
             *¿Hacer clic en el botón Powered by CookiePro?
             *Hacer clic en el botón de Rechazar Cookies
             *Hacer clic en el botón de Aceptar Cookies
             */
        }
}
