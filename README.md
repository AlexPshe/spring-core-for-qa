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
## Введение в git (1/0.5)
- Git local workflow
- Git remote workflow

### Практика
- Fork and clone main repo
- Pull Requests

## Современный гибкий и тестопригодный дизайн (3/1.5)
### Внутренняя модель качества
- Внутренние атрибуты качества

### OOAD как ответ на запрос бизнеса
- Пример процедурного legacy-кода и вопросы сопровождаемости
- Инкапсуляция
- Полиморфизм и абстракции
- Повторное использование и наследование/делегирование 

### Spring-ready архитектура
- Слои
- Зависимости компонентов: порождающие шаблоны 

### Практика 
- Рефакторинг процедурного legacy-кода
- Layered Design
- DI

## Тестирование Spring-ready системы (2/1)
### Тест-дизайн на примере JUnit-тестов
- Структура теста
- Именования
- Проверки 
- Тест-дублеры 
- Покрытие

### Практика
- Допокрытие системы до ≥80%

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
### Конфигурация
- Способы конфигурирования: [java](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-annotation-config), [xml, groovy](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Структура конфигурации](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Инициализация компонентов](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-basics)
- [Внедрение зависимостей](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-dependencies)
- [Жизненный цикл компонентов](https://docs.spring.io/spring/docs/5.0.0.RC3/spring-framework-reference/core.html#beans-factory-scopes)
- SpEL

### Тестовая конфигурация и профили
- Обзор модульных и интеграционных тестов
- Тесты как компоненты Spring
- Тест-дублеры
- Тестовые и production профили

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
- Spring Data ORM
- Обзор JPA Entities и Persistance Contexts
- Провиженинг схемы БД при изменениях структур данных

### Live coding demo
- CRUD App with JPA Repositories

### Practice Iteration 3
- Реализация CRUD-логики
- Покрытие модульными и интеграционными тестами CRUD-логики
- Сборка и запуск тестовых наборов

## Введение в Spring Boot (1/0)
- Задачи Spring Boot

### Live coding demo
- Рефакторинг Spring CRUD web-приложения на Boot
- Сборка и запуск тестов
