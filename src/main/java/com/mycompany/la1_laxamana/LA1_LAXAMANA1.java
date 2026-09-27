/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la1_laxamana;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class LA1_LAXAMANA1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        // Display the entered information
        System.out.println("\nEntered Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);

        scanner.close();
    }
}
