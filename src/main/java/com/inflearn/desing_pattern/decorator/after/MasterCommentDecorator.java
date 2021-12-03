package com.inflearn.desing_pattern.decorator.after;

public class MasterCommentDecorator extends CommentDecorator{
    public MasterCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        System.out.println("Master : 개쩌네");
        super.addComment(comment);
    }
}
