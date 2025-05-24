package com.mentoring.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mentoring.base.MetodosDriver;
import com.mentoring.pages.ModalCookies;

public class AceptarCookiesTest {

        WebDriver driver;
        private MetodosDriver metodosDriver;
        private ModalCookies modalCookies;
    
        @BeforeEach
        public void setUp() {
            ChromeOptions options = new ChromeOptions();
            // Desactivar headless para ver la ventana de Chrome
            options.addArguments("--headless=false");; // Asegúrate de que no está en modo headless
            options.addArguments("--enable-logging");   // Activa los logs de Chrome
            options.addArguments("--v=1");    // Establece el nivel de verbosidad de los logs  
            driver = new ChromeDriver();
            // Todo esto debería ir dentro de /base/MetodosDriver.java? Y llamar solo a la función setUp?
        }
    
        @Test
       public void aceptarCookiesTest(){

            metodosDriver.searchCasaDelLibro();
        // Quizás aquí falte meter una espera por si tardase en cargar?
            modalCookies.clicAceptarCookies();

            Assertions.assertFalse(driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).isDisplayed(),
            "El botón de cookies aún es visible"
);
       }

        @AfterEach

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
