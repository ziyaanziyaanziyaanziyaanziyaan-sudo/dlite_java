package com.module1;

import java.util.Scanner;

public class student
    {
        public static void main (String[]args)
        {
            Scanner s = new Scanner(System.in);

            System.out.println("enter the name:");
            String name = s.next();

            System.out.println("enter the usn:");
            String usn = s.next();

            System.out.println("enter the branch:");
            String branch = s.next();

            System.out.println("student name:"+name);
            System.out.println("student usn:"+usn);
            System.out.println("student branch:"+branch);

        }
}
