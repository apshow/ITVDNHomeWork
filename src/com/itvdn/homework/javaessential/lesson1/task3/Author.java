package com.itvdn.homework.javaessential.lesson1.task3;

public class Author {

    private String author;

    void show(){
        System.out.println("автор: " + getAuthor());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
