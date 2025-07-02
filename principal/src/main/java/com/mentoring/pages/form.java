package com.mentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class form {

    private WebDriver driver;

  private By titulo = By.xpath("//h1[@class='text-center']");

  // Elementos de userName-wrapper
    private By nombreLabel = By.id("usarName-label");
  private By inputName = By.id("firstName");
  private By inputLastName = By.xpath("//input[@id='lastName']");

  //Elementos de userEmail-wrapper

  private By emailLabel = By.id("userEmail-label");
  private By inputEmail = By.id("userEmail");
    
    // Elementos de Gender
    private By genderMale = By.xpath("//label[@for='gender-radio-1']");
    private By genderFemale = By.xpath("//label[@for='gender-radio-2']");
    private By genderOther = By.xpath("//label[@for='gender-radio-3']");

    // Elemento de Mobile
    private By inputMobile = By.id("userNumber");

    // Date of Birth
    private By dateOfBirthInput = By.id("dateOfBirthInput");
    private By monthSelect = By.className("react-datepicker__month-select");
    private By yearSelect = By.className("react-datepicker__year-select");
    private By daySelect = By.xpath("//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month'))]");

    // Subjects
    private By inputSubjects = By.id("subjectsInput");

    // Hobbies
    private By hobbySports = By.xpath("//label[@for='hobbies-checkbox-1']");
    private By hobbyReading = By.xpath("//label[@for='hobbies-checkbox-2']");
    private By hobbyMusic = By.xpath("//label[@for='hobbies-checkbox-3']");

    // Upload Picture
    private By uploadPicture = By.id("uploadPicture");

    // Current Address
    private By inputAddress = By.id("currentAddress");

    // State y City
    private By selectState = By.id("react-select-3-input");
    private By selectCity = By.id("react-select-4-input");

    // Botón Submit
    private By btnSubmit = By.id("submit");

    // Modal de confirmación
    private By modalTitle = By.id("example-modal-sizes-title-lg");
    private By closeModalBtn = By.id("closeLargeModal");
}

// Test iniciales

// ----> ¿Todos los elementos están visibles?
// ----> ¿Todos los elementos son como esperamos que sean?

