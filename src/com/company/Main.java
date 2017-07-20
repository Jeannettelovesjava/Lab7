package com.company;

import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {

    int studentNumber = 0;
    String userAsks;
    String answer = "YES";

    Scanner scan = new Scanner(System.in);

	String[] classNames = {"Charles","India", "Lisa", "Karl"};
	String[] favColor = {"Coral", "Indigo", "Lavendar", "Khaki" };
    String[] favFood = {"Cheese", "Ice Cream", "Lentils", "Kale"};

    System.out.println("Welcome to TechHire");
    do {

        try{
        System.out.println("Please enter a student number to learn more ( 1-4) ");
        studentNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Your student is: " + classNames[studentNumber - 1]);

        System.out.println("What would you like to know about the student? Enter 'Favorite Food' or 'Favorite Color' : ");

        userAsks = scan.nextLine();
    }

    catch (ArrayIndexOutOfBoundsException e) {

        if (userAsks.contains("food")) {
            System.out.println("Your student's favorite food is:" + favFood[studentNumber - 1]);
        } else if (userAsks.contains("color")) {
            System.out.println("Your student's favorite color is:" + favColor[studentNumber - 1]);
        }
        System.out.println("Would you like to learn more about another student? YES/NO");
        userAsks = scan.nextLine();

    }   while (answer.equalsIgnoreCase("YES");
        {}