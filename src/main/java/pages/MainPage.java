package pages;

import com.codeborne.selenide.SelenideElement;
import locators.ManePageLocators;
import settings.DriverSettings;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class MainPage extends DriverSettings {
    private final ManePageLocators locator = new ManePageLocators();

    public void closePopupCountry() {
        locator.btnClosePopupCountry.shouldBe(visible, enabled).click();
    }

    public void closePopupSubscribe() {
        locator.btnClosePopupSubscribe.click();
    }

    public void chooseCityFrom(String country) {
        locator.btnCityFrom.shouldBe(visible, enabled).click();

        for (SelenideElement element: locator.listCountries) {
            String textCountry = element.getText();
            if (textCountry.contains(country)) {
                element.shouldBe(visible, enabled).click();
            }
        }
    }

    public void chooseCountryTo(String country) {
        locator.btnCountryTo.click();
    }

    public void chooseDate(String date) {
        locator.btnDate.sendKeys(date);
    }

    public void chooseNights(String date) {
        locator.btnNights.sendKeys(date);
    }

    public void search() {
        locator.btnSearch.click();
    }
}
