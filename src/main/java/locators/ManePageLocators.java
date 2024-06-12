package locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class ManePageLocators {
    public final SelenideElement btnClosePopupCountry = $("#fancybox-close");
    public final SelenideElement btnClosePopupSubscribe = $("#cross");
    public final SelenideElement btnCityFrom = $("#cities");
    public final SelenideElement btnCountryTo = $x("(//*[@id='countries'])[1]");
    public final SelenideElement inputCountryTo = $x("//*[@class='search-form-field__input']");
    public final SelenideElement dropDownCountryTo = $x("//*[@class='nobr']");
    public final SelenideElement btnDate = $("#dateRange-from");
    public final SelenideElement btnNights = $("#nightsMin");
    public final ElementsCollection listCurrentDates = $$x("(//*[contains(@class,'pgs-datepicker-pane__items')])[2]");
    public final ElementsCollection listCountries = $$(By.className("pgs-dropdown-list__items"));
    public final SelenideElement btnSearch = $x("//input[@type='button']");
}
