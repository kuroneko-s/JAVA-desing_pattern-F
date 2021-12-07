package com.inflearn.desing_pattern.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> recentPostIterator;
    private List<Post> postList;

    public RecentPostIterator(List<Post> postList) {
        Collections.sort(postList, (p1, p2) -> p2.getCreateAt().compareTo(p1.getCreateAt()));
        this.recentPostIterator = postList.iterator();
//        this.postList = postList;
    }

    @Override
    public boolean hasNext() {
        return recentPostIterator.hasNext();
    }

    @Override
    public Post next() {
        return recentPostIterator.next();
    }
}
