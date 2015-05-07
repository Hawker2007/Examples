package com.horstmann.corejava;

import com.horstmann.corejava.*;
import static java.lang.System.*;

/**
 * Created by hawk on 28/04/15.
 * test package
 */

public class PackageTest {
    public static void main(String[] args) {
        // because of the import statement, we don't have to use com.horstmann.corejava.Employee here
        Employee harry = new Employee("Harry hacker", 50000, 1989, 10 , 1);

        harry.raiseSalary(5);

        // because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + "\nsalary=" + harry.getSalary());
    }
}
