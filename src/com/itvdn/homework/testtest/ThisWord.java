package com.itvdn.homework.testtest;

public class ThisWord {

    private int id;
    private String name;

    public ThisWord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        System.out.println(this);
        System.out.println(super.getClass());
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println(this);
        System.out.println(super.getClass().getName());
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ThisWord thisWord = new ThisWord(1, "Paul");

    }
}

