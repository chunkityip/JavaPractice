package org.example.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicAnswer {

    public static void main (String[] args) {
        //Easy level
        int myVariable;

        char valueA = 'A';

        int b = 20;

        /*
        Hello,
        This is multi-line comment
         */

        // Medium
        List<String> names = new ArrayList<>(Arrays.asList("CK" , "Lawrence" , "Aiden"));

        // Medium
        final int num = 3;
        printFinalValue(num);


    }

    // Easy
    static void greet() {
        System.out.println("Hello , World!");
    }

    // Medium
    static int swap(int num1 , int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        return temp;
    }

    // Medium
    static int multiply(int num1 , int num2) {
        return num1 * num2;
    }

    // Medium
    static int printFinalValue(int num) {
        return num;
    }

    // Hard
    static int maximumValue(List<Integer> num) {
        int max = Integer.MIN_VALUE;
        for (Integer n : num) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    static int fibonacci (int num) {
        if (num <= 1) return num;

        return (num - 1) * (num - 2);
    }


    static String printDetails(String name) {
        return name;
    }

    static int printDetails(int num) {
        return num;
    }

    static int[] modifyArray(int[] num) {
        int[] newNum = num;
        for (int i = 0; i < num.length; i++) {
            num[i] *= 2;
        }
        return newNum;
    }



}
