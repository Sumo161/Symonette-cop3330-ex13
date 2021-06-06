package ex13;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */


import java.util.Scanner;

public class App {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the principle amount?");
        int p = sc.nextInt();

        System.out.println("What is the rate?");
        float r = sc.nextFloat();

        System.out.println("What is the number of years?");
        int t = sc.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        int n = sc.nextInt();


        // int t1 = n*t;
        double a = (double) p * (Math.pow((1 + r / n), n * t));
        System.out.println("$" + p + "invested at " + r + "%for" + t + "years compounded" + n + "times per year is" + "$" + a);
    }
}

