package com.module1;
import java.util.Scanner;
public class Test2 {
    String ename;
    int age;
    String dept;
    double salary;
    public static void main(String[] args) {

        Test2 t1=new Test2();
        Scanner s=new Scanner(System.in);

        System.out.println("no. of employees:");
        int n =s.nextInt();


        for(int i=0;i<n;i++) {
            System.out.println("enter employee no: "+(i+1));

            System.out.println("Enter ename:");
            t1.ename=s.next();
            System.out.println("Enter age:");
            t1.age=s.nextInt();
            System.out.println("Enter dept:");
            t1.dept=s.next();
            System.out.println("Enter salary:");
            t1.salary=s.nextDouble();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("employee no: "+(i+1));

            System.out.println("ename:"+t1.ename);
        }



//        t1.ename="Shravan";
//        t1.age=28;
//        t1.dept="Softwaew Engineer";
//        t1.salary=45000;
//        System.out.println(t1.ename);

    }
}
