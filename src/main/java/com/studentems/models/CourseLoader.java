/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentems.models;

/**
 *
 * @author STM Developer
 */
public class CourseLoader extends Course{
    
    @Override
    public String getClassNaming()
    {
        super.getClassNaming();
        System.out.println("Course Loader");
        return "Course loader";
    }
}
