package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        return s;
    }

    public void displayResult(boolean result) {
        if(result==true){
            System.out.println("Valid");
        }
        if(result==false){
            System.out.println("Invalid or empty string");
        }
       
    }

    public boolean validatePhoneNumber(String s) {
        if(s==null||s==""||s==" "){
            return false;
        }
        else if(s.length()==12) {
            String[] a = s.split("-");
            int flag = 0;
            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < a[i].length(); j++) {
                    char ch = a[i].charAt(j);
                    if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                        flag = 0;

                    } else {
                        flag = 1;
                        return false;
                    }


                }

            }
            if (flag == 0) {
                return true;
            }
        }
        else{
            return false;
        }
    return false;
    }
}
