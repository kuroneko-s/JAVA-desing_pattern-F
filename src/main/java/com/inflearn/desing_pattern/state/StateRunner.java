package com.inflearn.desing_pattern.state;

import com.inflearn.desing_pattern.state.after.OnlineCourse;
import com.inflearn.desing_pattern.state.after.Private;
import com.inflearn.desing_pattern.state.after.Student;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// Client
// @Component
public class StateRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student dong = new Student("dong");
        dong.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("Hello", student);
        onlineCourse.addStudent(dong);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
