package model.subject;

import model.test.Test;

import java.util.ArrayList;

/**
 * Created by garciparedes on 16/7/15.
 */
public class Subject {

    private String name;
    private String description;

    private int hours;

    private ArrayList<Test> tests;

    private Subject prev;
    private Subject next;
}
