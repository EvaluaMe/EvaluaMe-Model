package model.Certification;

import model.degree.Degree;

import java.util.ArrayList;

/**
 * Created by garciparedes on 16/7/15.
 */
public class Certification {
    private String id;

    private String name;
    private String description;
    private ArrayList<Certification> minRequirements;

    private ArrayList<Degree> degrees;
}
