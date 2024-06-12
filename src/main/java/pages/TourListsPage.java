package pages;

import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.title;

public class TourListsPage {
    private String expectedTitle = "Туры. Турция, Все курорты. 12.06 - 12.06, 2 взрослых";

    public void checkTitle() {
        String title = title();
        Assertions.assertEquals(expectedTitle, title);
    }
}
