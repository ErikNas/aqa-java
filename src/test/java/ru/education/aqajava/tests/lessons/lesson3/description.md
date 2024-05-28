# Перенос проекта в Gitlab

tags: gitlab, git, ssh, scoop

## План

- Git
    - Регистрация на Gitlab;
    - Создание своего проекта;
    - Пакетные менеджеры;
    - Установка SSH и Git;
    - Создание ключей и настройка ssh config;
    - Клонирование проекта;
    - gitignore
    - Перенос существующего проекта в Gitlab;
- Знакомство с библиотекой Hamcrest;
    - Основные Matchers
        - equalsTo();
        - notNull();
        - hasKey();

## Лекция

### Git

Git - это система контроля версий. Эта система позволяет сохранять историю изменений вашего кода.  
Бывают ситуации, когда требуется вернуться на предыдущий вариант кода и гит позволяет просмотреть весь проект в разрезе
изменений.

Все команды выучить довольно трудно. Разберем только необходимый минимум.  
Основные команды Git:

- commit
- push
- pull

### Gitlab

Gitlab - это хостинг для хранения кода. Git хранит код только локально, а Gitlab делает его доступным по сети. Это
необходимо для совместной работы над одним проектом.

Помимо Gitlab есть Github и Bitbacket.  
Основные преимущества гитлаба это возможность развернуть систему на собственном сервере и наличие CI системы из коробки.

## Ресурсы

[Туториал по Hamcrest](http://hamcrest.org/JavaHamcrest/tutorial)  
[Testing with Hamcrest](https://www.baeldung.com/java-junit-hamcrest-guide)  
[GIT-тренажер](https://learngitbranching.js.org/)

## Самостоятельная работа

Перенести свой локальный проект в Gitlab.