package com.module1;

class Employee {
    String ename="riya";
    int age=30;
    private double salary;

    public void setData(double sal) {
        salary= sal;
    }
    public double getData()
    {
        return salary;
    }
}

public class emp1{
    public static void main(String[] args) {

        Employee e=new Employee();
        System.out.println(e.ename);
        System.out.println(e.age);

        e.setData(30000.00);
        System.out.println(e.getData());
    }
}