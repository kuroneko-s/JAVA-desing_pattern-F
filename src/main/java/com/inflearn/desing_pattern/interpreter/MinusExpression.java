package com.inflearn.desing_pattern.interpreter;

import java.util.Map;

/**
 * ??? Terminal Expression
 */
public class MinusExpression implements PostfixExpression{

    private PostfixExpression left, right;

    public MinusExpression(PostfixExpression left, PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }

}
