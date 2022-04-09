package com.studentems.interfaces;

import com.studentems.models.Course;
import java.util.List;

/**
 *
 * @author STM Developer
 */
public interface ICourseManagementService {
    public void addCourse(Course course);
    public void removeCourse(String courseId);
    public Course getCourseById(String courseId);
    public List<Course> listCourses();
}
