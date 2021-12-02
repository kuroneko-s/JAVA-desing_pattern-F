package com.inflearn.desing_pattern.prototype;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class CloneRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
            Object clone() 부분
         */
        Student s1 = new Student("Hello1");
        Student s2 = new Student("Hello2");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        ArrayList<Student> studentsClone = new ArrayList<>(students); // 일반적으로 사용하는 방법
        System.out.println(studentsClone);

        //TODO ModelMapper

    }
}
