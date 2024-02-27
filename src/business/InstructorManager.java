package org.example.business;

import org.example.dataAccess.Dao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logging.Logger;

import java.util.List;
import java.util.Objects;

public class InstructorManager {

    private Dao instructorDao;
    private List<Logger> loggers;
    private List<Instructor> instructors;

    public InstructorManager(Dao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.addInstructor(instructor);

        for(Logger logger : loggers){
            logger.log(instructor.getName());
        }
    }

    public void addCourse(Instructor instructor, Course course){
        instructor.addCourse(course);

        for(Logger logger : loggers){
            logger.log(course.getName());
        }
    }
}
