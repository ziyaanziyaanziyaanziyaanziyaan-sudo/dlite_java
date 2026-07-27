package com.module1;

public class sstring {
    public static void main(String[] args) {
//        StringBuilder s1= new StringBuilder("java");
//        System.out.println(s1);
//        s1.append("Language");
//        System.out.println(s1);
//
//        //insert
//        s1.insert(1,"abc");
//        System.out.println(s1);
//
//        s1.reverse();
//        System.out.println(s1);
//
//        s1.delete(1,5);
//        System.out.println(s1);
//
//        System.out.println(s1.length());
//
//        System.out.println(s1.charAt(2));

        String s2= "NSAMFGC";
        System.out.println(s2.toLowerCase());
        System.out.println(s2.indexOf("N"));
        System.out.println(s2.lastIndexOf("N"));
        System.out.println(s2.substring(0,5));
        System.out.println(s2.substring(5));


        String s3="abc";
        String s4="abc";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));



    }

}
