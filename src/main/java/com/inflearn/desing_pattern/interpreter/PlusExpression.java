package com.inflearn.desing_pattern.interpreter;

import java.util.Map;

/**
 * ??? Terminal Expression
 */
public class PlusExpression implements PostfixExpression{

    private PostfixExpression left, right;

    public PlusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }

}
