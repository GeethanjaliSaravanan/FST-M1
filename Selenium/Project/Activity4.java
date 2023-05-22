package org.example;

import java.util.*;

public class Activity4 {

    public  static  void main(String[] args) {

        int arr[] = {4, 3, 2, 1, 10, 6, 5, 7, 9, 8};

        List<Integer> list= new ArrayList<Integer>();

        for(int arr1 : arr){

            list.add(arr1);


        }
        Collections.sort(list);

        System.out.println(list);


    }

}
