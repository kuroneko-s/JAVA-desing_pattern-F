package com.inflearn.desing_pattern.state.after;


// State
public interface State {
    void addReview(String review, Student student);

    void addStudent(Student student);
}
