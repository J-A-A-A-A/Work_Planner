package com.company;

public class Lesson {
    public int number;
    public String name;
    public String learningObjective;
    public String content;
    public String resources;
    public String successCriteria;

    // Constructor
    public Lesson(int number, String name, String learningObjective, String content, String resources, String successCriteria) {
        this.number = number;
        this.name = name;
        this.learningObjective = learningObjective;
        this.content = content;
        this.resources = resources;
        this.successCriteria = successCriteria;
    }

}
