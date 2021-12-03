package com.inflearn.desing_pattern.decorator.after;

public class Client {
    CommentService commentService; // 최상위 인터페이스

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment){
        commentService.addComment(comment);
    }
}
