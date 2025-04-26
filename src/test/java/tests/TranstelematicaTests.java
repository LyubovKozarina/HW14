package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class TranstelematicaTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка заголовка страницы")
    void checkPageTitleTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Проверить заголовок <title>", () -> mainPage.checkTitle("Сервисный центр Транстелематика"));
    }

    @Test
    @DisplayName("Переход в раздел 'О компании'")
    void goToAboutPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'О компании'", () -> mainPage.goToAboutPage());
        step("Проверить заголовок страницы 'О компании'", () -> mainPage.checkPageHeader("О компании"));
    }

    @Test
    @DisplayName("Переход в раздел 'Услуги'")
    void goToServicesPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'Услуги'", () -> mainPage.goToServicesPage());
        step("Проверить заголовок страницы 'Услуги'", () -> mainPage.checkPageHeader("Услуги"));
    }

    @Test
    @DisplayName("Переход в раздел 'Проекты'")
    void goToProjectsPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'Проекты'", () -> mainPage.goToProjectsPage());
        step("Проверить заголовок страницы 'Проекты'", () -> mainPage.checkPageHeader("Проекты"));
    }

    @Test
    @DisplayName("Переход в раздел 'Контакты'")
    void goToContactsPageTest() {
        step("Открыть главную страницу", () -> mainPage.openMainPage());
        step("Нажать на пункт меню 'Контакты'", () -> mainPage.goToContactsPage());
        step("Проверить заголовок страницы 'Контакты'", () -> mainPage.checkPageHeader("Контакты"));
    }
}
