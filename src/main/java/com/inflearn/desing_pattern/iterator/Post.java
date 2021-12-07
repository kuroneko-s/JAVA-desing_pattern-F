package com.inflearn.desing_pattern.iterator;

import java.time.LocalDate;

public class Post {
    private String title;
    private LocalDate createAt;

    public Post(String title) {
        this.title = title;
        this.createAt = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }
}
