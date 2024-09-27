package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        char a = 'y';
        int firstValue=0;
        int secondValue=0;
        int operator=0;
        do{
            firstValue=scan.nextInt();
            secondValue=scan.nextInt();
            operator=scan.nextInt();
            a=scan.next().charAt(0);

        }while(a =='y');
        System.out.println(calculate(firstValue, secondValue, operator));
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        switch(operator){
            case 1:{
                return firstValue +" + "+secondValue+" = "+(firstValue+secondValue);
            }
            case 2:{
                return firstValue +" - "+secondValue+" = "+(firstValue-secondValue);
            }
            case 3:{
                return firstValue +" * "+secondValue+" = "+(firstValue*secondValue);
            }
            case 4:{
                if (secondValue != 0) {
                    return firstValue + " / " + secondValue + " = " + (firstValue / secondValue);
                }
                else {
                   return  "The divider (secondValue) cannot be zero";
                }
            }
            default:{
                return "Entered wrong option "+operator;
            }

        }
    }
}
