package com.horstmann.corejava;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by hawk on 28/04/15.
 * test class
 */

public class Employee {
    public Employee(String n, double s, int year, int mouth, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, mouth - 1, day);
        // GregorianCalendar uses 0 for January
        hireDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    private String name;
    private double salary;
    private Date hireDay;
}
