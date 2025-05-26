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
import com.mentoring.steps.Steps;


public class AceptarCookiesTest {

        private WebDriver driver;
        private MetodosDriver metodosDriver;
        private ModalCookies modalCookies;
        private Steps steps;
    
        @BeforeEach

        public void iniciarDriver(){
            metodosDriver = new MetodosDriver();
            driver = metodosDriver.setUp();
            
        }
    
        @Test
       public void aceptarCookiesTest(){

            metodosDriver.searchCasaDelLibro(this.driver);
        // Quizás aquí falte meter una espera por si tardase en cargar?
            steps.aceptarCookies();
       }

        @AfterEach

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
