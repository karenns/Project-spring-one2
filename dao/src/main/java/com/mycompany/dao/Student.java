/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author W208079293
 */
public class Student {

    String firstName;
    String lastName;
    String dob;

    @Autowired
    Address address;

    @Autowired
    Grade grade;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void displayStudent() {
        System.out.println("First Name: " + firstName + " Last Name: " + lastName + " DoB: " + dob + " Subject: " + getGrade().getSubject()
                + " Grade: " + getGrade().getLetterGrade() + " City: " + getAddress().getCity()
        );
    }

}
