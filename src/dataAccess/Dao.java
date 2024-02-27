package org.example.dataAccess;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

public interface Dao {
    void addCourse(Course course);
    void addInstructor(Instructor instructor);
    void addCategory(Category category);
}
