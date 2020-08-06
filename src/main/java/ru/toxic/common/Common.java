package ru.toxic.common;

import io.vavr.Tuple;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import static io.vavr.control.Try.run;

@Component
public class Common {

    @NonNull
    public static Tuple getUsedDriverKey() {
        return Tuple.of(Thread.currentThread().getName());
    }

    public static void setValueFromSelectByValue(@NonNull WebElement select, @NonNull WebDriverWait wait, @NonNull String value) {
        run(() -> wait.until(ExpectedConditions.elementToBeClickable(select)))
                .andThen(select::click)
                .andThen(() -> new Select(select).selectByValue(value))
                .andThen(select::click)
                .get();
    }

    public static void setValueFromSelectByText(@NonNull WebElement select, @NonNull WebDriverWait wait, @NonNull String text) {
        run(() -> wait.until(ExpectedConditions.elementToBeClickable(select)))
                .andThen(select::click)
                .andThen(() -> new Select(select).selectByVisibleText(text))
                .andThen(select::click)
                .get();
    }

    public static void setDataToInput(@NonNull WebElement input, @NonNull WebDriverWait wait, @NonNull String data) {
        run(() -> wait.until(ExpectedConditions.elementToBeClickable(input)))
                .andThen(input::clear)
                .andThen(() -> input.sendKeys(data))
                .get();
    }

    public static void clickHideCheckbox(@NonNull WebElement parentElement, @NonNull WebElement checkbox, @NonNull WebDriverWait wait) {
        run(() -> wait.until(ExpectedConditions.elementToBeClickable(parentElement)))
                .andThen(() -> run(() -> {
                    if (!checkbox.isDisplayed()) {
                        parentElement.click();
                    }
                }).get())
                .andThen(() -> clickCheckbox(checkbox, wait))
                .get();
    }

    public static void clickCheckbox(@NonNull WebElement checkbox, @NonNull WebDriverWait wait) {
        run(() -> wait.until(ExpectedConditions.elementToBeClickable(checkbox)))
                .andThen(() -> {
                    if (!checkbox.isSelected()) {
                        checkbox.click();
                    }
                }).get();
    }
}