package org.example.dataAccess;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

public class JdbcDao implements Dao{
    @Override
    public void addCourse(Course course){
        System.out.println(course.getName() + " kursu JDBC ile veritabanına eklendi.");
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getName() + " eğitmeni JDBC ile veritabanına eklendi.");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println(category.getName() + " kategorisi JDBC ile veritabanına eklendi.");
    }

}
