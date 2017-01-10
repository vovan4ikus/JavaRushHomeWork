package com.javarush.test.level26.lesson15.big01.command;

import com.javarush.test.level26.lesson15.big01.Operation;
import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 10.01.17.
 */
public class CommandExecutor {


    private static Map<Operation, Command> map;

    static {
        map = new HashMap<>();
        map.put(Operation.INFO, new InfoCommand());
        map.put(Operation.DEPOSIT, new DepositCommand());
        map.put(Operation.WITHDRAW, new WithdrawCommand());
        map.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation){
        map.get(operation).execute();
    }
    private CommandExecutor(){}

}
