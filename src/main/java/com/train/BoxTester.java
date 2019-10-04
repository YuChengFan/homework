package com.train;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        PostOfficeBox box3 = new PostOfficeBox(23f, 14f, 13);
        PostOfficeBox box5 = new PostOfficeBox(39.5f, 27.5f, 23);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length :");
        float inputLength = scanner.nextFloat();
        System.out.println(inputLength);
        System.out.println("Please enter object's width :");
        float inputWidth = scanner.nextFloat();
        System.out.println(inputWidth);
        System.out.println("Please enter object's height :");
        int inputHeight = scanner.nextInt();
        System.out.println(inputHeight);

        boolean box3Validation = box3.validate(inputLength, inputWidth, inputHeight);
        boolean box5Validation = box5.validate(inputLength, inputWidth, inputHeight);
        if (box3Validation && box5Validation){
            System.out.println("box3 and box5");
        } else if (box3Validation){
            System.out.println("box3");
        } else if (box5Validation){
            System.out.println("box5");
        } else {
            System.out.println("no suitable box");
        }
    }
}
