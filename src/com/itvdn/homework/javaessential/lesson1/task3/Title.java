package com.itvdn.homework.javaessential.lesson1.task3;

public class Title {
    private String title;

    void show(){
        System.out.println("название: " + getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
