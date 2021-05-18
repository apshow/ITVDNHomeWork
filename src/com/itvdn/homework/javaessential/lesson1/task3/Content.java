package com.itvdn.homework.javaessential.lesson1.task3;

public class Content {
    private String content;

    void show(){
        System.out.println("текст: " + getContent());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
