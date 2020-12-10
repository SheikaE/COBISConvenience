package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // create & populate array list
        ArrayList<String> items = new ArrayList<String>();
        ArrayList<Double> itemsPrice = new ArrayList<Double>();
        items.add("Red-Hot Spicy Doritos");
        itemsPrice.add(2.99);
        items.add("Cool Ranch Doritos");
        itemsPrice.add(2.99);
        items.add("Coke");
        itemsPrice.add(0.99);
        items.add("Diet Coke");
        itemsPrice.add(0.99);
        items.add("Pepsi");
        itemsPrice.add(0.99);
        items.add("Five Hour Energy");
        itemsPrice.add(3.99);
        items.add("Sunflower Seeds");
        itemsPrice.add(0.99);
        items.add("Peanuts.");
        itemsPrice.add(0.99);
        items.add("Mac Book Chargers");
        itemsPrice.add(120.00);
        items.add("Dell Chargers");
        itemsPrice.add(50.00);

        // new array list to populate customer data
        ArrayList<String> selectItems = new ArrayList<String>();
        ArrayList<Integer> itemQuantity = new ArrayList<Integer>();

        // initializers for customer inputs
        String selection;
        Scanner itemName = new Scanner(System.in);
        String multipleSelections = "";



        // initializers for totals
        double receipt;
        double dailyTotal = 0;
        System.out.println("Enter Customer Name: ");

        // loop for customer name
        while (!(selection = itemName.nextLine()).equals("Next")) {
            multipleSelections += "\n" + selection;
            receipt = 0;
            System.out.println("Enter item name: ");
            System.out.println("Enter 'Complete', if finished. ");

            //loop to customer items/purchases
            while (!(selection = itemName.nextLine()).equals("Complete")) {
                for (String i : items) {
                    if (i.contains(selection)) {
                        receipt += itemsPrice.get(items.indexOf(i));
                        multipleSelections += "\n" + selection;
                        if (!selectItems.contains(selection)) {
                            selectItems.add(selection);
                            itemQuantity.add(1);
                        } else {
                            int index = selectItems.indexOf(selection);
                            itemQuantity.set(index, itemQuantity.get(index) + 1);
                        }
                        break;
                    }
                }
            }
            multipleSelections += "\n" + receipt + "\n";
            Math.round((receipt*100)/100);
            dailyTotal += receipt;
            Math.round((dailyTotal *100)/100);
            System.out.println("Enter next customer name:");
            System.out.println("Enter 'Next', if finished.");
        }
        // total for receipt and inventory sold
        System.out.println("Receipt: \n" + multipleSelections);
        System.out.println("Inventory Sold: ");
        for (String i:selectItems){
            System.out.println(i + " ("+ itemQuantity.get(selectItems.indexOf(i)) +")");
        }
        System.out.println("Daily Total: " + dailyTotal);
    }
}
