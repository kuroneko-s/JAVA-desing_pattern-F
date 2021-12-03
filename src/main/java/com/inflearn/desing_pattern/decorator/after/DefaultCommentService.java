package com.inflearn.desing_pattern.decorator.after;

/* Leaf 가장 기본적인 객체 */
public class DefaultCommentService implements CommentService{

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
