package com.studentems;

import com.studentems.models.Course;
/**
 *
 * @author STM Developer
 */
public class StudentEMS {

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Course course1 = new Course(); //Instantiation / user-defined type
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();
        course1.createClassObj();
        course2.createClassObj();
        
        System.out.println(course3.getClassNaming());
        System.out.println(course4.getGrading(50));
    }
}
