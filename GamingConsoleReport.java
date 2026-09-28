/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1;

/**
 * PROG6112 - Question 1
 * Number 1 Electronics: gaming console sales report
 * Uses a single-dimensional array for cities/consoles
 * and a two-dimensional array for the sales figures.
 */
public class GamingConsoleReport {

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        // Single-dimensional array to store the total sales per city
        int[] cityTotals = new int[cities.length];

        // ---------- Gaming console report ----------
        System.out.println("--------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------");

        // Header row
        System.out.printf("%-18s", "");
        for (int c = 0; c < consoles.length; c++) {
            System.out.printf("%-10s", consoles[c]);
        }
        System.out.println();

        // Sales per city and per console + calculate the totals
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i].toUpperCase());
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
                cityTotals[i] += sales[i][j];
            }
            System.out.println();
        }

        // ---------- Console sales totals for each city ----------
        System.out.println("--------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------");

        int highestTotal = cityTotals[0];
        int highestIndex = 0;

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i].toUpperCase(), cityTotals[i]);

            // Find the city with the most sales
            if (cityTotals[i] > highestTotal) {
                highestTotal = cityTotals[i];
                highestIndex = i;
            }
        }

        // ---------- City with the most sales ----------
        System.out.println("--------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex].toUpperCase());
        System.out.println("--------------------------------------------------------");
    }
}