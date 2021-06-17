package com.itvdn.homework.testtest;

import java.time.LocalDate;
import java.util.Date;

public class TestData {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Paul");

        e1.dateOfBirth.getTime();
        e1.dateOfHire.getTime();

        System.out.println(e1);

    }


}


class Employee {
    int id;
    String name;
    //LocalDate
    Date dateOfBirth;
    Date dateOfHire;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = new Date();
        this.dateOfHire = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfHire=" + dateOfHire +
                '}';
    }
}
