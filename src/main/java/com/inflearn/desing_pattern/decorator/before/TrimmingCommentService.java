package com.inflearn.desing_pattern.decorator.before;

public class TrimmingCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        comment = comment.replace("...", "");
        super.addComment(comment);
    }
}
