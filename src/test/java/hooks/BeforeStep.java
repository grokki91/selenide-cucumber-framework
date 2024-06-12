package hooks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class BeforeStep {
    private final MainPage mainPage = new MainPage();

    @BeforeEach
    public void closePopups() {
        open("/");
        mainPage.closePopupCountry();
//        mainPage.closePopupSubscribe();
    }
}
