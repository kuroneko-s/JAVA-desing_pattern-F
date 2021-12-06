package com.inflearn.desing_pattern.interpreter;

import java.util.Stack;

import static com.inflearn.desing_pattern.interpreter.PostfixExpression.*;

public class PostfixParser {
    // expression == xyz+-
    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        // [x, y, z, +, -]
        for (char c: expression.toCharArray()) {
            // x, y, z, +, - 중에 해당하는 특정 PostfixExpression 구현체를 가져올 것이다.
            stack.push(getExpressionWithInterface(c, stack));
        }

        return stack.pop();
    }

    private static PostfixExpression getExpressionWithInterface(char c, Stack<PostfixExpression> stack) {
        switch (c){
            case '+':
                return plus(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return minus(left, right);
            default:
                return variable(c);
        }
    }

    private static PostfixExpression getExpressionWithClasses(char c, Stack<PostfixExpression> stack) {
        switch (c){
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }
}
