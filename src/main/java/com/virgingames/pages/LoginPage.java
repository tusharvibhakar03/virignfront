package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;


public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement cookies;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement Login;




    public void acceptCookies() {
        clickOnElement(cookies);
    }
        public void clickOnLogin () {
            clickOnElement(Login);

        }


    }