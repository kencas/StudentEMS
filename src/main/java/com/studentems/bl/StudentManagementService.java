package com.studentems.bl;

import com.studentems.interfaces.IStudentManagementService;
import com.studentems.models.Student;
import java.util.List;

/**
 *
 * @author STM Developer
 */
public class StudentManagementService implements IStudentManagementService
{
    @Override
    public void onBoardStudent(Student student)
    {
        
    }

    @Override
    public List<Student> listStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student getStudentById(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteStudent(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
