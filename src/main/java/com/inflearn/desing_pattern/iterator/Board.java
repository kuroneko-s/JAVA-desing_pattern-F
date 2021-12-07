package com.inflearn.desing_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String title) {
        posts.add(new Post(title));
    }

    public Iterator<Post> getRecentIter(){
        return new RecentPostIterator(this.posts);
    }
}
