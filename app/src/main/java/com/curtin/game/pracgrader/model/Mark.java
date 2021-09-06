package com.curtin.game.pracgrader.model;

public class Mark {
    private String description;
    private double mark;
    public Mark(String desc, double mark) {
        this.description = desc;
        this.mark = mark;
    }

    public double getMark() {
        return this.mark;
    }

    public String getDescription() {
        return this.description;
    }

    public int setDescription(String description) {
        if(description.trim().equals("")) {
            return 0;
        }
        this.description = description;
        return 1;
    }

    public int setMark(double mark) {
        if(mark < 0.0) {
            return 0;
        }
        this.mark = mark;
        return 1;
    }
}
