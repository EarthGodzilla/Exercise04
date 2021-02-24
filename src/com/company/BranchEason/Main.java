package com.company.BranchEason;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] cities = getCities();
        tempatures(cities);


    }

    static String[] getCities() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 cities ");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
        String city3 = input.nextLine();
        String city4 = input.nextLine();
        String city5 = input.nextLine();
        String[] fiveCities = {city1, city2, city3, city4, city5};
        return fiveCities;
    }

    static void tempatures(String[] a) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter 5  temperatures for " + a[i]);
            System.out.println("Input first temperatures: ");
            int num1 = in.nextInt();

            System.out.println("Input second temperatures: ");
            int num2 = in.nextInt();

            System.out.println("Input third temperatures: ");
            int num3 = in.nextInt();

            System.out.println("Input fourth temperatures: ");
            int num4 = in.nextInt();

            System.out.println("Enter fifth temperatures: ");
            int num5 = in.nextInt();
             int[] tempatures={num1,num2,num3,num4,num5};
             output(tempatures,a);
        }
    }
    static void output(int[] a, String[] b) {
        System.out.println("The average tempature in " + b + " is: " +
                (a[0]+a[1]+a[2]+a[3]+a[4]) / 5.0);
    }
}


