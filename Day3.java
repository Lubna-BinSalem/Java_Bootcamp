package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        //Exercise #1
        System.out.println("Exercise #1");

        String Name[]={"Saleh", "Khaled", "Majed"};
        for (int i = 0; i < 3; i++) {
            System.out.println(Name[i]);
        }

        //Exercise #2
        System.out.println("Exercise #2");

        for (int i = 1; i <= 33; i++) {
            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }


        //Exercise #3
        System.out.println("Exercise #3");

        String Cities[]={"Riyadh","Jeddah","Dammam", "Mecca", "Madina"};
        for (int i = 4; i >=0; i--) {
            System.out.println(Cities[i]);
        }

        //Exercise #4
        System.out.println("Exercise #4");

        String[] UserNames ={"Abdullah","Amir","Abbas", "Bilal", "Saad","Malik","Habib","Omar", "Azad", "Nasir"};
        for (int i = 0; i < UserNames.length; i++) {
            if(UserNames[i].charAt(0)=='A'){
                continue;
            }
            System.out.println(UserNames[i]);
        }
        //Exercise #5
        System.out.println("Exercise #5");

        PrintArray(UserNames);
        //Exercise #6
        System.out.println("Exercise #6");
        int[] numList =new int[3];
        numList=ArrayMaker(6,2,9);
        for (int i = 0; i < 3; i++) {
            System.out.println(numList[i]);}

            //Exercise #7
            System.out.println("Exercise #7");
            PrintName("lubna","Salem");

            //Exercise #8
            System.out.println("Exercise #8");
            System.out.println(Average(76,84,66,92));

            //Exercise #9
            System.out.println("Exercise #9");
            int grades[]={76,48,82,100};
            System.out.println(Biggest(grades));


        //end main
    }
    public static void PrintArray(String[] names){
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static int[] ArrayMaker(int A, int B, int C ){
        int num[]= new int[3];
        num[0]=A;
        num[1]=B;
        num[2]=C;
        return num;
    }
    public static void PrintName(String first, String last){
        System.out.println("Hello "+first+" "+last);
    }
    public static double Average(int a, int b, int c, int d){
        double average=(a+b+c+d)/4;
        return average;
    }
    public static int Biggest(int[] num){
        int biggest= num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]>biggest){
                biggest=num[i];
            }
        }
        return biggest;
    }
}
