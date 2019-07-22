package com.bob;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter object's length: ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        float height = scanner.nextFloat();

        if (box3.validate(length, width, height)) {
            box3.printResult();
        } else if (box5.validate(length, width, height)) {
            box5.printResult();
        } else {
            System.out.println("This box isn't suitable.");
        }

    }
}
