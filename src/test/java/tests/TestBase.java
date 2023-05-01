package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAll() {

        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 600000;
        Configuration.pageLoadTimeout = 600000;
        Configuration.remoteConnectionTimeout = 600000;
        Configuration.remoteReadTimeout = 600000;

    }
}