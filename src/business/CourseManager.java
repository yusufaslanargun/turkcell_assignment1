package org.example.business;

import org.example.dataAccess.Dao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logging.Logger;

import java.util.List;
import java.util.Objects;

public class CourseManager {

    private Dao courseDao;
    private List<Logger> loggers;
    private CategoryManager categoryManager;
    private InstructorManager instructorManager;
    private List<Course> courses;

    public CourseManager(Dao courseDao, List<Logger> loggers, CategoryManager categoryManager, InstructorManager instructorManager) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.categoryManager = categoryManager;
        this.instructorManager = instructorManager;
    }
    public void add(Course course, Category category, Instructor instructor) throws Exception {
        boolean isUnique = true;

        if(courses != null){
            for (Course item : courses) {
                if (Objects.equals(course.getName(), item.getName())) {
                    isUnique = false;
                    break;
                }
            }
        }

        if(!isUnique){
            throw new Exception("Kurs ismi tekrar edemez");
        }
        if(course.getPrice() < 0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
        }
        courseDao.addCourse(course);
        for(Logger logger : loggers){
            logger.log(course.getName());
        }
        categoryManager.addCourse(category, course);
        instructorManager.addCourse(instructor, course);

    }
}
