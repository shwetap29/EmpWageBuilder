package com.bridgelabz;

public class EmpWagebuilder {
    public static void main(String[] args) {
        int IS_PRESENT= 1;
        double empCheck = (Math.random() * 10) % 2;
         if (empCheck == IS_PRESENT) {
             System.out.println("employee is present");
         }else{
             System.out.println("employee is absent");
         }

        }

}
