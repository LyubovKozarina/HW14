package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public void openMainPage() {
        open("/");
    }

    public void goToAboutPage() {
        $("a[href='/about/']").click();
    }

    public void goToServicesPage() {
        $("a[href='/services/']").click();
    }

    public void goToProjectsPage() {
        $("a[href='/projects/']").click();
    }

    public void goToContactsPage() {
        $("a[href='/contacts/']").click();
    }

    public void checkPageHeader(String expectedHeaderText) {
        $("h1").shouldHave(text(expectedHeaderText));
    }

    public void checkTitle(String expectedTitle) {
        title().equals(expectedTitle);
    }
}
