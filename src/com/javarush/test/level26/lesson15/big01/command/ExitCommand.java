package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.ConsoleHelper;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

/**
 * Created by User on 10.01.17.
 */
class ExitCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException{
        ConsoleHelper.writeMessage("Are you sure want to quit? (y,n):");
        String answer;

        answer = ConsoleHelper.readString();
        if ("y".equalsIgnoreCase(answer.trim())){
            ConsoleHelper.writeMessage("Bye");
        }
        else if ("n".equalsIgnoreCase(answer.trim())){
            CommandExecutor.execute(ConsoleHelper.askOperation());
        }

    }
}
