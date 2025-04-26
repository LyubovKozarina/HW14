package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static io.qameta.allure.Allure.step;

public class TranstelematicaTests extends TestBase {

    @Test
    @DisplayName("Проверка заголовка страницы")
    void checkPageTitleTest() {
        step("Открыть главную страницу", () -> open(baseUrl));
        step("Проверить заголовок <title>", () ->
                title().equals("Сервисный центр Транстелематика")
        );
    }

    @Test
    @DisplayName("Переход в раздел 'О компании'")
    void goToAboutPageTest() {
        step("Открыть главную страницу", () -> open(baseUrl));
        step("Нажать на пункт меню 'О компании'", () ->
                $("a[href='/about/']").click()
        );
        step("Проверить заголовок страницы 'О компании'", () ->
                $("h1").shouldHave(text("О компании"))
        );
    }

    @Test
    @DisplayName("Переход в раздел 'Услуги'")
    void goToServicesPageTest() {
        step("Открыть главную страницу", () -> open(baseUrl));
        step("Нажать на пункт меню 'Услуги'", () ->
                $("a[href='/services/']").click()
        );
        step("Проверить заголовок страницы 'Услуги'", () ->
                $("h1").shouldHave(text("Услуги"))
        );
    }

    @Test
    @DisplayName("Переход в раздел 'Проекты'")
    void goToProjectsPageTest() {
        step("Открыть главную страницу", () -> open(baseUrl));
        step("Нажать на пункт меню 'Проекты'", () ->
                $("a[href='/projects/']").click()
        );
        step("Проверить заголовок страницы 'Проекты'", () ->
                $("h1").shouldHave(text("Проекты"))
        );
    }

    @Test
    @DisplayName("Переход в раздел 'Контакты'")
    void goToContactsPageTest() {
        step("Открыть главную страницу", () -> open(baseUrl));
        step("Нажать на пункт меню 'Контакты'", () ->
                $("a[href='/contacts/']").click()
        );
        step("Проверить заголовок страницы 'Контакты'", () ->
                $("h1").shouldHave(text("Контакты"))
        );
    }
}
