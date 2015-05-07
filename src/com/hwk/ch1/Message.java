package com.hwk.ch1;

/**
 * Created by hawk on 26/04/15.
 * Input params test
 */

public class Message {
    public static void main(String[] args) {
        if (args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
        //print other command-line arguments
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");
    }
}
