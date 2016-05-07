package main;

import classes.ExampleClass;

import java.util.function.Function;

/**
 * Created on 06.05.16.
 *
 * @author m
 */
public class Main {
    /**
     * @param args strings to print
     */
    public static void main(String[] args) {
        System.out.println("args:");

        for (String arg : args)
            System.out.println(arg);

        ExampleClass ec = new ExampleClass();
        System.out.println(ec.succ(0));


    }
}
