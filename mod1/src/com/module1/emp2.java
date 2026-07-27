package com.module1;

class Emp3{
    String ename="karan";
    int age=20;
    private double salary;

    public void setData(double sal) {
        salary= sal;
    }
    public double getData()
    {
        return salary;
    }}
public class emp2{
    public static void main(String[] args) {

        Emp3 e = new Emp3();
        System.out.println(e.ename);
        System.out.println(e.age);

        e.setData(50000.00);
        System.out.println(e.getData());
    }
}
