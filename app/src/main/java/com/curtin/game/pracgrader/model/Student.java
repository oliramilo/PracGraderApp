package com.curtin.game.pracgrader.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;

    private List<Mark> grades;
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public List<Mark> getStudentGrades() {
        return this.grades;
    }

    public int addGrade(Mark mark) {
        if(mark != null) {
            grades.add(mark);
            return 1;
        }
        return 0;
    }

}
