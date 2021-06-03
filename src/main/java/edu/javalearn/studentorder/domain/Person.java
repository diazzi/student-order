package edu.javalearn.studentorder.domain;

import java.time.LocalDate;

public abstract class Person {
    private String surName;
    private String givName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Person() {

    }

    public Person(String surName, String givName, String patronymic, LocalDate dateOfBirth) {
        this.surName = surName;
        this.givName = givName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivName() {
        return givName;
    }

    public void setGivName(String givName) {
        this.givName = givName;
    }

    public String getPatronmyc() {
        return patronymic;
    }

    public void setPatronymic(String patronmyc) {
        this.patronymic = patronmyc;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}