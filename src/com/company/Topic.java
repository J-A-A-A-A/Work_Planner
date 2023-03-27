package com.company;

import java.util.ArrayList;

public class Topic {
    private double number;
    private String name;
    private int yearGroup;
    private int[] term;
    private int[] week;
    private ArrayList<Lesson> lessons;

    // Constructor
    public Topic(double number, String name, int yearGroup, int[] term, int[] week, ArrayList<Lesson> lessons) {
        this.number = number;
        this.name = name;
        this.yearGroup = yearGroup;
        this.term = term;
        this.week = week;
        this.lessons = lessons;
    }

    //Setter

}
