package com.pluarlsight;

import java.util.Scanner;

public class PayrollCalculato {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("whats your name?: ");
        String name = scanner.nextLine();
        System.out.println("how many hours have you worked?: ");
        float hoursWorked = scanner.nextFloat();
        System.out.println("whats your pay rate?: ");
        float payRate = scanner.nextFloat();
        float grossPay = hoursWorked * payRate;
        System.out.printf("%s because you worked %.2f hours and your hourly wage is %.2f your gross pay is  %.2f",name,hoursWorked,payRate,grossPay);




    }
}
