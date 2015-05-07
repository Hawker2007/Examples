package com.hwk.ch1;

import java.util.*;

public class InputTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //get first string
        System.out.print("What it your name ? ");
        String name = in.nextLine();

        //get second input
        System.out.print("How old are you ? ");
        int age = in.nextInt();

        //display output in console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age +1));

    }
}
