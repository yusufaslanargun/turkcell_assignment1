package org.example.entities;

import java.util.List;

public class Category {
    private int categoryID;
    private String name;
    private List<Course> courses;

    public Category(int categoryID, String name) {
        this.categoryID = categoryID;
        this.name = name;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        System.out.println(course.getName() + " kursu " + name + " kategorisine eklendi.");
    }
}
