/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.prog6112.st10533635.question2;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ConsoleSalesNGTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] consoleTypes = {"PS5", "XBOX", "NINTENDO SWITCH"};

        // ---------- Select console type ----------
        System.out.println("SELECT A CONSOLE TYPE");
        for (int i = 0; i < consoleTypes.length; i++) {
            System.out.println((i + 1) + ". " + consoleTypes[i]);
        }

        int choice = 0;
        while (choice < 1 || choice > consoleTypes.length) {
            System.out.print("Enter your choice (1-" + consoleTypes.length + "): ");
            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                choice = 0;
            }
            if (choice < 1 || choice > consoleTypes.length) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        String consoleType = consoleTypes[choice - 1];

        // ---------- Store name ----------
        System.out.print("Enter the store name: ");
        String store = input.nextLine().trim();

        // ---------- Total sales ----------
        int totalSales = -1;
        while (totalSales < 0) {
            System.out.print("Enter the total amount of sales: ");
            try {
                totalSales = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                totalSales = -1;
            }
            if (totalSales < 0) {
                System.out.println("Invalid amount. Please enter a whole number of 0 or more.");
            }
        }

        // ---------- Instantiate and print ----------
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        System.out.println();
        report.printReport();

        input.close();
    }
}

