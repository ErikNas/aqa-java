# Создание структуры проекта. Знакомство с Allure.

## План

- Причины создания общей структуры проекта
- Знакомство с Allure
    - Настройка Gradle
    - Запуск через меню gradle
    - Запуск через cli
    - Аннотации Allure

## Лекция

### Структура проекта

![img](src/test/resources/img/structure.png)

ru.education.course:

**ru** - страна, в которой находится подразделение.

**education** - наименование подразделения.

**course** - наименование тестируемого сервиса.

**helpers** - пакет, в котором содержатся классы, использующиеся другими классами для упрощения выполнения операций или
сокращения объёма кода.

Пример: класс, который содержит в себе URI тестируемых методов. Этот класс избавляет от необходимости написания ёмких по
длине URI в коде.

**models** - пакет, в котором содержатся классы, использующиеся как шаблоны для выполнения операций.

Пример: класс, который будет хранить в себе данные для авторизации на сайте.

**tests** - пакет, в котором содержатся тесты для методов сервиса.

**resources** - каталог ресурсов проекта.

## Allure

Allure - это про построение отчетов

**Прогон автотестов** - это запуск набора автотестов для проекта с целью проверить корректность сервисов и устранить
причину падения или завести дефект.
В реальных проектах на ряду с регрессным ручным тестированием, также и проводится прогон автотестов.
Обычно оно проводиться при каждом релизе, но может проводиться и с определенной периодичностью или по требованию.

Allure автоматизирует сбор результатов тестирования, интегрируясь в ваш проект, ровно до такой степени,
что вам требуется лишь запустить автотесты. Неважно сделаете вы это вручную, запустив через окно запуска среды
разработки,
или воспользуйтесь командой test сборщика gradle.

### Как построить отчет по прогону?

1. Добавить в проект через build.gradle
   в plugins

- ```id 'io.qameta.allure' version '2.9.6''```
  этот плагин автоматически подгрузит все необходимые библиотеки для работы

![плагин](src/test/resources/img/img.png)

- добавить зависимость в раздел dependencies, для добавления логирования api запросов и ответов в отчеты к автотестам
  ```testImplementation group: 'io.qameta.allure', name: 'allure-rest-assured', version: '2.13.6'```

![img_6.png](src/test/resources/img/img_6.png)

2. Запустить набор автотестов

- отчет строится после запуска автотестов
- после запуска автотестов по пути build\allure-results проекта создаются файлы с отчетами

![файлы с отчетами](src/test/resources/img/img.png)

- выполнить команду allureServe для отображения отчета в окне браузера

Отчет автоматически откроется в новой вкладке браузера

### Формат отчета Allure

Allure предоставляет удобный формат просмотра результатов прогона:

1. Packages/отображение автотестов в проекте согласно их расположению:

2. Behaviors/отображение автотестов в проекте согласно их функциональности (Задается через @Epic, @Feature, @Story
   аннотации)

С подробным описанием аннотации функциональности можно познакомиться из
статьи [Allure habr](https://habr.com/ru/company/sberbank/blog/359302/)

3. Suits/отображение автотестов в проекте по классам

С полным описанием всех секции отчета можно ознакомиться на оф.
сайте [report_structure_Allure](https://docs.qameta.io/allure/#_report_structure)

## Ресурсы

С подробным перечнем аннотации и их использованием можно ознакомится в источниках:

[Официальная дока Allure](https://docs.qameta.io/allure/#_junit_5)  
[Allure habr](https://habr.com/ru/company/sberbank/blog/359302/)

## Самостоятельная работа

1. Создать структуру тестов для вашего проекта.
2. Добавить аннотации для Allure.
3. Запушить все в GitLab.