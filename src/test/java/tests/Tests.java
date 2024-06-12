package tests;

import com.codeborne.selenide.Selenide;
import hooks.BeforeStep;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.TourListsPage;
import settings.DriverSettings;

public class Tests extends DriverSettings {
    private final MainPage mainPage = new MainPage();
    private final BeforeStep hook = new BeforeStep();
    private final TourListsPage tours = new TourListsPage();

    @Test
    @DisplayName("Check the opening of a new tab")
    public void testOpenNewTab() {
        hook.closePopups();
        mainPage.chooseCityFrom("Москва");
        mainPage.chooseCountryTo("Турция");
        mainPage.chooseDate("25.06.2024");
        mainPage.chooseNights("9");
        mainPage.search();
        Selenide.switchTo().window(1);
        tours.checkTitle();
    }
}
