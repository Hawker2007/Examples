package com.hwk.ch4;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by hawk on 26/04/15.
 * tests the Employee2 class.
 */

public class EmployeeTest {
    public static void main(String[] args) {
        // fill te staff array with three Employee2 objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee2 objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}

class Employee
{
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;

        if (year < 0 && month < 0 && day < 0)
        {
            year = GregorianCalendar.YEAR;
            month = GregorianCalendar.MONTH;
            day = GregorianCalendar.DAY_OF_WEEK;
        }

        GregorianCalendar calendar = new GregorianCalendar(year,month -1, day);
        // Gregorian calendar uses 0 for January
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