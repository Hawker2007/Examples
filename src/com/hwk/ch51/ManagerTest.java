package com.hwk.ch51;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by hawk on 11/05/15.
 * inheritance
 */

public class ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        // fill the staff array with Manager and Employee

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 4000, 1990, 3, 15);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}

class Employee
{
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
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

    private String name;
    private double salary;
    private Date hireDay;
}

class Manager extends Employee
{
    /**
     * @param n the employee's name
     * @param s the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

    public Manager(String n, double s, int year, int month, int day )
    {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }

    private double bonus;
}