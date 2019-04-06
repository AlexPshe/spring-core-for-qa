# Тренинг «Введение в Spring для QA»
15 часов.<br/>
_Рассмотрим основные концепции и ограничения Spring в разработке приложений и автотестов. Это актуально и разработчикам автотестов, т.к. Spring поможет снизить трудоемкость их разработки, так и ручным тестировщикам, т.к. им необходимо конфигурировать Spring-приложения перед прогоном тестового набора._

# Для кого
- ручные QA Spring-приложений
- разработчики (любых) автотестов Spring-приложений

# На выходе
- участники поймут структуру Spring-приложений и Spring-based тестов
- смогут ускорить разработку автотестов за счет возможностей Spring и компонентов в его составе

# Программа
## Обзор фреймворка Spring (3 часа всего / из них 1 час практики)
- [Понятие фреймворка](https://www.programcreek.com/2011/09/what-is-the-difference-between-a-java-library-and-a-framework/) и [контейнеров](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- Spring Core как [DI](https://en.wikipedia.org/wiki/Dependency_injection) Framework
- Понятие [конфигурации](https://www.tutorialspoint.com/spring/spring_java_based_configuration.htm) и [контекста](https://spring.io/understanding/application-context)
- Концепция AOP и реализация ключевых задач фреймворка с помощью proxies
- Обзор [модулей Spring](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.html)

### Live coding demo
- Обзор [зависимостей](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/overview.html#dependency-management) и структуры типового Spring Application
- [Компоненты/бины](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics), неявный аспект их именования
- Сборка и запуск приложения

### Practice Iteration 0
- Сборка и запуск приложения
- Локализация и решение проблем

## Конфигурация приложения для test и production (3/1)
- Способы конфигурирования: [java](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-annotation-config), [xml, groovy](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Структура конфигурации](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Инициализация компонентов](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Внедрение зависимостей](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-dependencies)
- [Жизненный цикл компонентов](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-factory-scopes)
- SpEL
- Обзор модульных и интеграционных тестов
- Тесты как компоненты Spring
- Тест-дублеры
- Тестовые и production конфигурации приложения

### Live coding demo
- Обзор тестовой кодовой базы
- Сборка приложения и тестов и запуск тестов

### Practice Iteration 1
- Покрытие модульными и интеграционными тестами
- Тестовые конфигурации
- Сборка и запуск тестовых наборов

## Жизненный цикл компонентов Spring и их вызовы (3/1.5)
- События жизненного цикла компонента и их обработчики
- Управление безопасностью
- Управление транзакциями
- Управление повторами операций
- Ресурсы как частный случай компонентов

### Practice Iteration 2
- Допокрытие модульными и интеграционными тестами бизнес-логики
- Собственная логика жизненного цикла
- Конфигурация безопасности, транзакций и retrying
- Сборка и запуск тестовых наборов

## Доступ к данным (3/1)
- Тестовые и production конфигурации РСУБД источников данных
- Понятие Connection Pool
- Spring JDBC Template и Raw Mappers
- Spring Data ORM
- Обзор JPA Entities и Persistance Contexts
- Провиженинг схемы БД при изменениях структур данных

### Live coding demo
- CRUD App with JDBC Template
- CRUD App with JPA Repositories

### Practice Iteration 3
- Реализация CRUD-логики
- Покрытие модульными и интеграционными тестами CRUD-логики
- Сборка и запуск тестовых наборов

## Введение в Spring MVC для Web UI (2/1)
- Обзор архитектуры MVC
- Контроллеры
- Представления
- Связывание данных на представлении

### Live coding demo
- CRUD App with web interface
- Запуск web-контейнера
- Сборка и развертывание приложения
- Обзор готовых Selenium-тестов

### Practice Iteration 4
- Реализация web UI
- Анализ Selenium-тестов и их Spring-конфигурации
- Сборка и запуск тестовых наборов

## Введение в Spring Boot (1/0)
- Задачи Spring Boot

### Live coding demo
- Рефакторинг Spring CRUD web-приложения на Boot
- Сборка и запуск тестов
