package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MMLogoCreator logo = new MMLogoCreator();
        Scanner input = new Scanner(System.in);

        int inputN;

        do {
            System.out.print("Enter 0 to end program!\n");
            System.out.print("Enter N(letter width) in the range 2 < N < 10000 : ");
            inputN = input.nextInt();
            if (inputN != 0) {
                System.out.println(logo.printLogo(inputN));
            }
        } while (inputN != 0);
    }
}