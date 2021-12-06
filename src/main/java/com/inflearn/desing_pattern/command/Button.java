package com.inflearn.desing_pattern.command;

import java.util.Stack;

public class Button {

    private Stack<Command> commandStack = new Stack<>();

    public void press(Command command){
        command.execute();
        this.commandStack.push(command);
    }

    public void undo(){
        Command command = this.commandStack.pop();
        command.undo();
    }

}
