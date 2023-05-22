package org.example;

import java.util.Arrays;

public class Activity2 {

     public static void main(String[] args){

         int[] numArr = {10, 77, 10, 54, -11, 10};

        int value= 10;

        int sum= 0;

        //System.out.println(value);

        for(int num: numArr){

            if(num==value){

               sum += value;


            }
            if(sum > 30){

                break;
            }


        }
         System.out.println(sum==30);


     }
}
