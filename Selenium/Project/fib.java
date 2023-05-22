package org.example;

// Java Program to Find Factorial of a Number
// where N>=0 is currently N>1

// Importing input output classes
import java.io.*;
// importing utility classes
import java.util.*;

// Main class
class fib {

    // Method 1
    // To calculate factorial
    static int factorial(int n)
    {

        // Handling base case
        // If value of n=1 or n=0, it returns 1
        if (n == 0 || n == 1)
            return 1;

        // Generic case
        // Otherwise we do n*(n-1)!
  int fact=factorial(n-1);
  System.out.println(fact);
        int no= n*fact;
        System.out.println(no);
        return no;

    }
    static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        int sumof=sum_of_digit(n / 10);
      System.out.println(sumof);
       int data=n % 10 +
               sumof;
      System.out.println(data);
        return data;
    }
    public static int fibRecursion(int count) {
        if (count == 0) {
            return 0;
        } // Oth fibonacci is 0

        if (count == 1 || count == 2) {
            return 1;
        } // 1st and 2nd Fibonacci are 1 and 1 only

        // calling function recursively for nth Fibonacci
        return fibRecursion(count - 1) +
                fibRecursion(count - 2);
    }


    // Method 2
    // main driver method
    public static void main(String[] args)
    {

//        // Calling method 1 to compute factorial and
//        // storing the result into a variable
       // int ans = factorial(5);
        //	System.out.println("value of" + ans + " factorial" + factorial(ans - 1));

        // Print and display the factorial of number
        // customly passed as an argument
     //   System.out.println("Factorial of 5 is :" + ans);
//        for (int i = 3; i < 6; i++) {
//            System.out.print(fibRecursion(i) + " ");
//        }

        int num = 687;
       int result = sum_of_digit(num);
       System.out.println("Sum of digits in " +
               num + " is " + result);
    }
}
