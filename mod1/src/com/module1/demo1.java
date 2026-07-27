package com.module1;
import java.util.Scanner;

class details {

    private int pin=1111;
    int epin;
    int amt=10000;
    private double balance;

    public void setPin(int upin) {
        pin = upin;
    }
    public int getPin() {
        return pin;
    }

//    int epin,double amt
    void deposit(){
        if(pin==epin)
        {
            balance=balance+amt;
            System.out.println("DEPOSITED SUCCESSFULLY !!");
            System.out.println("Remaning balance is: "+balance);
        }
        else {
            System.out.println("INVALID PIN !!");
        }
    }

//    int epin,double amt
    void withdraw(){
        if(pin==epin)
        {
            balance=balance-amt;
            System.out.println("WITHDRAWN SUCCESSFULLY !!");
            System.out.println("Remaning balance is: "+balance);
        }
        else{
            System.out.println("INVALID PIN !!");
        }

    }

//    int epin
    void checkBal(){
        if(pin==epin)
        {
            System.out.println("BALANCE: "+balance);
        }
        else{
            System.out.println("INVALID PIN !!");
        }

    }

}

public class demo1{
    public static void main(String[] args) {
        details d=new details();
        Scanner s=new Scanner(System.in);

//        d.setPin(1111);
//        System.out.println(d.getPin());
//
//        d.deposit(1111,30000);
//        d.withdraw(1111,5000);
//        d.checkBal(1111);

        System.out.println("MENU");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAWN");
        System.out.println("3. CHECK BALANCE ");


        System.out.println("Enter pin: ");
        d.epin=s.nextInt();

        System.out.println("ENTER CHOICE:");
        int ch=s.nextInt();

        switch(ch)
        {
            case 1 -> d.deposit();
            case 2 -> d.withdraw();
            case 3 -> d.checkBal();
            default -> System.out.println("BYE");
        }


//        d.deposit();
//        d.withdraw();
//        d.checkBal();


    }
}
