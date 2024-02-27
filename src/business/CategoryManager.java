package org.example.business;

import org.example.dataAccess.Dao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;
import org.example.logging.Logger;

import java.util.List;
import java.util.Objects;

public class CategoryManager {
    private Dao categoryDao;
    private List<Logger> loggers;
    private List<Category> categories;

    public CategoryManager(Dao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        boolean isUnique = true;

        if(categories != null) {
            for (Category item : categories) {
                if (Objects.equals(category.getName(), item.getName())) {
                    isUnique = false;
                }
            }
        }

        if(!isUnique){
            throw new Exception("Kategori ismi tekrar edemez");
        }
        categoryDao.addCategory(category);

        for(Logger logger : loggers){
            logger.log(category.getName());
        }
    }

    public void addCourse(Category category, Course course){
        category.addCourse(course);

        for(Logger logger : loggers){
            logger.log(course.getName());
        }
    }
}
