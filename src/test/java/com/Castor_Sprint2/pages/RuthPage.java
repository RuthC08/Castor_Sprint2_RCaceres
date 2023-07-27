package com.Castor_Sprint2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RuthPage  {

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][5]")
    public WebElement marketingModule;

    @FindBy(xpath = "(//span[.='Campaigns'])[1]")
    public WebElement campaings;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement manageFilterDropdown;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement iconFiltersButton;

    @FindBy(xpath = "//input[@title= 'Name']")
    public WebElement radioName;

    @FindBy(xpath = "//input[@title= 'Start Date']")
    public WebElement radioStartDate;



}
