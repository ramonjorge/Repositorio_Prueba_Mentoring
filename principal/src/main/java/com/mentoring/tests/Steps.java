package com.mentoring.tests;

import org.openqa.selenium.WebDriver;

import com.mentoring.pages.ModalCookies;


public class Steps {

    ModalCookies modalCookies;
    private WebDriver driver;

    public Steps(WebDriver driver){
        this.driver = driver;
    }

    public void aceptarCookies(){
        this.modalCookies.clicAceptarCookies(driver);
        this.modalCookies.comprobarCookiesNoVisibles(driver);
    }

    
}
