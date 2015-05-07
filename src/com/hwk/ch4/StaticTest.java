package com.hwk.ch4;

/**
 * Created by hawk on 27/04/15.
 * static methods
 */

public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee2 objects
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Tom", 40000);
        staff[1] = new Employee2("Dick", 60000);
        staff[2] = new Employee2("Harry", 65000);

        // print out information about all Employee objects
        for (Employee2 e : staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        int n = Employee2.getNextId();
        System.out.println("Next available id=" + n);
    }
}

class Employee2
{
    public Employee2(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void main(String[] args) // unit test
    {
        Employee2 e = new Employee2("Harry", 500);
        System.out.println(e.getName() + " " + e.getSalary());
    }

    private String name;
    private double salary;
    private int id;
    private static int nextId = 1;
}