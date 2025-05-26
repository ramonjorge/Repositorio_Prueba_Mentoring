package com.mentoring.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalCookies {
    private WebDriver driver;

//Locators

    private final By botonRechazarCookies = By.xpath("//button[@id='onetrust-reject-all-handler']");
    private final By botonAceptarCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");

//Métodos / Acciones

    public void clicAceptarCookies(WebDriver driver){

        driver.findElement(botonAceptarCookies).click();
    }

// Puede que sea más correcto meterlo en utils ya que no es propio de la página como tal.

    public void comprobarCookiesNoVisibles(WebDriver driver){

         Assertions.assertFalse(driver.findElement(botonRechazarCookies).isDisplayed(),
            "El botón de cookies aún es visible");

    }
}

