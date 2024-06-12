package settings;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

public class DriverSettings {
    private final ConfigProperties configuration;

    public DriverSettings() {
        this.configuration = new ConfigProperties();
    }

    public void setUp() {
        try {
            Configuration.browser = configuration.getValue("browser");
            Configuration.pageLoadStrategy = configuration.getValue("loadStrategy");
            Configuration.browserSize = configuration.getValue("browserSize");
            Configuration.headless = configuration.getValue("headless", false);
            Configuration.baseUrl = configuration.getValue("url");
            Configuration.timeout = configuration.getValue("timeout", 20000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterAll
    public static void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
