package com.inflearn.desing_pattern.state.after;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<OnlineCourse> privateCourse = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable(OnlineCourse onlineCourse) {
        return privateCourse.contains(onlineCourse);
    }

    public void addPrivate(OnlineCourse onlineCourse) {
        this.privateCourse.add(onlineCourse);
    }
}
