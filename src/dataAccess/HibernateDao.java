package org.example.dataAccess;

import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

public class HibernateDao implements Dao{
    @Override
    public void addCourse(Course course) {
        System.out.println(course.getName() + " kursu Hibernate ile veritabanına eklendi.");
    }
    @Override
    public void addInstructor(Instructor instructor){
        System.out.println(instructor.getName() + " eğitmeni Hibernate ile veritabanına eklendi.");
    }
    @Override
    public void addCategory(Category category) {
        System.out.println(category.getName() + " kategorisi Hibernate ile veritabanına eklendi.");
    }
}
