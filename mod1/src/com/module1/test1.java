package com.module1;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
                StringBuilder s1= new StringBuilder("java");
        System.out.println(s1);
        s1.append("Language");
        System.out.println(s1);

        //insert
        s1.insert(1,"abc");
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);

        s1.delete(1,5);
        System.out.println(s1);

        System.out.println(s1.length());

        System.out.println(s1.charAt(2));
        String s="NSAM";
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("N"));
        System.out.println(s.lastIndexOf("M"));
        System.out.println(s.substring(1,5));
        System.out.println(s.length());
        String x="abc";
        String y="abc";
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));
        String p="karan";
        for (int i=0;i<p.length();i++)
        {
            System.out.println(p.charAt(i));
        }
    }
}
