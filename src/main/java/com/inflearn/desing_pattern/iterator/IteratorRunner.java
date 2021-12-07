package com.inflearn.desing_pattern.iterator;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Iterator;

//@Component
public class IteratorRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Board board = new Board();
        board.addPost("Hello");
        board.addPost("my 2300$");
        board.addPost("fuck");

        Iterator<Post> recentIter = board.getRecentIter();
        while (recentIter.hasNext()){
            System.out.println(recentIter.next().getTitle());
        }
    }
}
