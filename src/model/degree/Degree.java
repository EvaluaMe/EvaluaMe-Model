package model.degree;

import model.Certification.Certification;
import model.course.Course;
import model.school.School;

import java.util.ArrayList;

/**
 * Created by garciparedes on 16/7/15.
 */
public class Degree {

    private String id;

    private String name;
    private String description;

    private ArrayList<Certification> certifications;
    private ArrayList<Course> courses;

    private School school;
}
