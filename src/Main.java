package org.example;

import org.example.business.CategoryManager;
import org.example.business.CourseManager;
import org.example.business.InstructorManager;
import org.example.dataAccess.HibernateDao;
import org.example.dataAccess.JdbcDao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logging.DBLogger;
import org.example.logging.Logger;
import org.example.logging.MailLogger;
import org.example.logging.FileLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2,"Analiz");
        Instructor instructor1 = new Instructor(1,"John Doe");
        Instructor instructor2 = new Instructor(2,"Jane Doe");
        Course course1 = new Course(1, "Java Programlama", 0);
        Course course2 = new Course(2, "C# Programlama", 10);
        Course course3 = new Course(4, "Analiz 1", 0);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DBLogger());

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(), loggers);
        CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, categoryManager, instructorManager);

        categoryManager.add(category1);
        categoryManager.add(category2);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        courseManager.add(course1, category1, instructor1);
        courseManager.add(course2, category1, instructor2);
        courseManager.add(course3, category2, instructor2);

    }
}