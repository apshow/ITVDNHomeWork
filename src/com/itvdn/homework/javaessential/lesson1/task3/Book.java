package com.itvdn.homework.javaessential.lesson1.task3;

public class Book {

    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor("Tom");
        author.show();

        Content content = new Content();
        content.setContent("some content");
        content.show();

        Title title = new Title();
        title.setTitle("some title");
        title.show();
    }
}

//        Задание 3
//        Используя IDEA, создайте проект c пакетом.
//        Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
//        содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу названия
//        книги, имени автора и содержания. Выведите на экран при помощи метода show() название книги, имя автора
//        и Содержание.
