/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author W208079293
 */
public class StudentManager {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student std = (Student) context.getBean("student");
        std.displayStudent();

     
    }
}
