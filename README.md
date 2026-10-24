# java-practice

Мой репозиторий для практики по Java (SoloLearn "Введение в Java" и дальше, к Fabric-модам для Minecraft).

## Структура

- `src/` — код по темам (`m01_basics`, `m02_methods`, `m03_oop`, ...)
- `tasks/` — условия практических задач (по одному .md на задачу)
- `notes/` — конспекты и шпаргалки

## Как работать

1. Закончил урок -> создал задачу в `tasks/` (условие + что должно получиться).
2. Решение пишу в `src/<модуль>/ИмяЗадачи.java`.
3. Коммит: `git commit -m "m02: methods return value"`.

## Запуск

```bash
javac -d out src/m02_methods/ReturnValue.java
java -cp out m02_methods.ReturnValue
```

## Прогресс

- [x] Введение в Java (SoloLearn)
- [ ] Методы — практика
- [ ] ООП (классы, объекты)
- [ ] Коллекции
- [ ] Первый Fabric-мод
