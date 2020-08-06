package ru.toxic.page;

import lombok.Builder;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ru.toxic.common.Common.*;

public class BuySalePage {

    private final WebDriverWait wait;

    @Getter
    private final MainPage mainPage;

    @FindBy(css = "a.border-0")
    private WebElement fastSaleBuyTypeButton; // При первичном переходе выбрана покупка

    @FindBy(css = "input.form-control")
    private WebElement searchSumInput;

    @FindBy(css = ".btn-warning")
    private WebElement searchButton;

    @FindBy(css = "div.p-0:nth-child(2) > select:nth-child(1)")
    private WebElement selectCountry;

    @FindBy(css = "div.p-0:nth-child(3)")
    private WebElement selectCurrency;

    @FindBy(css = "div.p-0:nth-child(4) > select:nth-child(1)")
    private WebElement selectPaySystem;

    @Builder
    public BuySalePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 120);
        mainPage =  MainPage.builder().driver(driver).build();
        mainPage.clickBuySaleLink();
        PageFactory.initElements(driver, this);
    }

    public void clickAnotherDealType(){
        fastSaleBuyTypeButton.click();
    }

    public void setSum(String sum){
        setDataToInput(searchSumInput, wait, sum);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    // Default country is Russia
    public void setCountryByValue(String country){
        setValueFromSelectByValue(selectCountry, wait, country);
    }

    public void setCountryByText(String country){
        setValueFromSelectByText(selectCountry, wait, country);
    }

    // Default currency is RUB (change with country)
    public void setCurrency(String currency){
        setValueFromSelectByValue(selectCountry, wait, currency);
    }

    // Default system is QIWI (change with country)
    public void setPaySystemByValue(String system){
        setValueFromSelectByValue(selectCountry, wait,system);
    }

    public void setPaySystemByText(String system){
        setValueFromSelectByText(selectCountry, wait,system);
    }
}