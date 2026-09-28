/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2;

/**
 * PROG6112 - Question 2
 * Abstract class storing the console type, store name and total sales.
 */
public abstract class Consoles implements IConsoles {

    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor accepting console type, store name and total sales
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Implemented by the subclass
    public abstract void printReport();
}