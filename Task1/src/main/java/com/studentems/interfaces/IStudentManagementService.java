/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentems.interfaces;
import com.studentems.models.Student;
import java.util.List;

/**
 *
 * @author Philip
 */
public interface IStudentManagementService {
    
    public void onBoardStudent(Student student);
    public List<Student> listStudents();
    public Student getStudentById(String studentId);
    public void deleteStudent(String studentId);
    
}
