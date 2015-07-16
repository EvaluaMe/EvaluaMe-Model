package model.course;

import model.degree.Degree;
import model.subject.Subject;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by garciparedes on 16/7/15.
 */
public class Course {

    private String id;
    private int grade;

    private GregorianCalendar beginDate;
    private GregorianCalendar endDate;

    private ArrayList<Subject> subjects;
    private Degree degree;
}
