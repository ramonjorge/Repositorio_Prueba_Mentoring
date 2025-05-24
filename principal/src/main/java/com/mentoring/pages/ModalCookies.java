package com.mentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalCookies {
    private WebDriver driver;

//Locators

    private final By botonRechazarCookies = By.xpath("//button[@id='onetrust-reject-all-handler']");
    private final By botonAceptarCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");

//Métodos / Acciones

    public void clicAceptarCookies(){

        driver.findElement(botonAceptarCookies).click();
    }


}
