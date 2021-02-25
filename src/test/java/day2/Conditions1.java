package day2;

import java.util.Scanner;

public class Conditions1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if (marks < 40) {
            System.out.println("fail");

        } else if (marks >= 40 && marks < 45) {
            System.out.println("Pass class");

        } else if (marks >= 45 && marks < 55) {
            System.out.println("2nd class");

        } else if (marks >= 55 && marks < 75) {
            System.out.println("1st class");

        } else if (marks >= 75 && marks < 100) {
            System.out.println("Top class");

        } else {

            System.out.println("Contact Admin!!!");

        }
    }
}