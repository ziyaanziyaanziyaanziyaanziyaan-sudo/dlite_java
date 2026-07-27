package com.module1;
import java.util.Scanner;
public class variable
{
    public static void main (String[]args)
    {
        System.out.println("HELLO WORLD");

        Scanner s=new Scanner(System.in);
        System.out.println("enter the pin");
        int pin=s.nextInt();
        System.out.println("pin:"+pin);
        int opin=200;
        if(opin==pin)
        {
            System.out.println("pin correct");
        }
        else
        {
            System.out.println("pin incorrect");
        }

    }
}
