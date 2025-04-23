
<a href="https://usetech.ru/ "> <img src="images/logo.png" width="150" height="50"> 
<h1 >Проект по автоматизации тестирования для компании <a href="https://transtelematica.ru"> Сервисный центр Транстелематика</a></h1> 

## ☑️ Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>
## :ballot_box_with_check:Технологии и инструменты:

|         Java                                                                                                      | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        |   Telegram
|:----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="images/java-svgrepo-com.svg" width="50" height="50"  alt="Java"/></a>  | <a href="https://www.jetbrains.com/idea/"><img src="images/intellij-idea-svgrepo-com.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/github-badge-svgrepo-com.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/gradle-svgrepo-com.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/Allure.svg" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="images/Telegram.svg" width="50" height="50" alt="Telegram"/></a> |<a href="https://qameta.io/"><img src="images\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

<a id="cases"></a>
## :ballot_box_with_check: Реализованные проверки:

- Проверка заголовка страницы
- Переход в раздел 'О компании' с главной страницы и проверяем текст заголовка страницы 'О компании'
- Переход в раздел 'Услуги' с главной страницы и проверяем текст заголовка страницы 'Услуги'
- Переход в раздел 'Проекты' с главной страницы и проверяем текст заголовка страницы 'Проекты'
- Переход в раздел 'Контакты' с главной страницы и проверяем текст заголовка страницы 'Контакты'

## <img alt="Jenkins" height="25" src="images/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/KozarinaL_HW14/)


<p align="center">  
<img src="images/JenkinsBuild.jpg" alt="Jenkins" width="950"/></a>  
</p>


## :ballot_box_with_check: Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 125.0)


## Команда для запуска из терминала
Локальный запуск
```bash
gradle clean test
```
Запуск с параметрами:
```bash  
-Dbrowser=chrome -DbrowserVersion=125.0 -DremoteUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub -DscreenResolution=1920x1080 -DvideoUrl=https://selenoid.autotests.cloud/video/
```
Удаленный запуск через Jenkins:
```bash  
clean test
-Dbrowser="${browser}"
-DbrowserVersion="${browserVersion}"
-DremoteUrl="${remoteUrl}"
-DscreenResolution="${screenResolution}"
-DvideoUrl="${videoUrl}"
```

## <img alt="Allure" height="25" src="images/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure Report	</a>


## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="images/AllureReport.jpg" width="850">  
</p>  

____
## <img alt="Allure" height="25" src="images/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/tgAllert.jpg" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/news.gif" width="550" height="350"  alt="video">   
</p>

<p align="center">
<img title="Selenoid Video" src="images/contact.gif" width="550" height="350"  alt="video">   
</p>
