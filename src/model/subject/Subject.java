package model.subject;

import model.course.Course;
import model.test.Test;

import java.util.ArrayList;

/**
 * Created by garciparedes on 16/7/15.
 */
public class Subject {
    private String id;

    private String name;
    private String description;

    private int hours;

    private ArrayList<Test> tests;

    private ArrayList<String> teachers;

    private Subject prev;
    private Subject next;

    private Course course;
}
