package com.company.BranchEason;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 5 cities ");
        String City1 = in.nextLine();
        String City2 = in.nextLine();
        String City3 = in.nextLine();
        String City4 = in.nextLine();
        String City5 = in.nextLine();

        System.out.println("Please enter 5  temperatures? ");
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

        System.out.println("The tempature in "+City1+" is: "+num1+" ,The tempature in "+City2+" is: "+num2+" ,The tempature in "+City3+" is: "+num3);
        System.out.println("The tempature in "+City4+" is: "+num4+" ,The tempature in "+City5+" is: "+num5);
        System.out.println("The average of the five Tempatures is: " +
                (num1 + num2 + num3 + num4 + num5) / 5.0);



    }
}

