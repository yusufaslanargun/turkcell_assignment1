package org.example.entities;

import org.example.entities.Course;

import java.util.List;

public class Instructor {
    private int instructorID;
    private String name;
    private List<Course> courses;
    private String mailAddress;
    private String phoneNumber;

    public Instructor(int instructorID, String name) {
        this.instructorID = instructorID;
        this.name = name;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
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

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addCourse(Course course){
        System.out.println(course.getName() + " kursu " + name + " eğitmenine eklendi.");
    }
}
