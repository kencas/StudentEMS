package com.studentems.interfaces;

import com.studentems.models.Student;
import java.util.List;

/**
 *
 * @author STM Developer
 */
public interface IStudentManagementService {
    public void onBoardStudent(Student student);
    public List<Student> listStudents();
    public Student getStudentById(String studentId);
    public void deleteStudent(String studentId);
}
