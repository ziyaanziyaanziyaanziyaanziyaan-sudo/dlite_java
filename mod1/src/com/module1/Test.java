package com.module1;

public class Test {

    int age=20;
    static String college="nsamfgc";

    static void display()
    {
        String name = "shramith";
        System.out.println("name:" + name);
    }
     public static void main(String[] args)
    {
        Test t=new Test();
        System.out.println(t.age);
        t.display();
    }



}
