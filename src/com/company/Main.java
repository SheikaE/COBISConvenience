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

        // prompt user for name



        // create new array list to store customer inputs & initializers
        ArrayList<String> selectItems = new ArrayList<String>();
        String selection  = "";
        String multipleSelection = "";
        double grandtotal = 0.00;
        double total;

        System.out.print("Welcome! Please enter your name: ");
        System.out.print("Enter 'Done' to continue.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        while(!(name.equals("Done"))) {
            multipleSelection += " " + selection;
            total = 0.00;

            System.out.println("What would you like to buy " + name + "?");
            System.out.println("Add Items or Enter Exit to Continue.");
            selection = input.nextLine();

            while (!(selection.equals("Exit"))) { //loop to enter each ordered item
                for (String i : items) {
                    if (i.contains(selection)) {
                        total += itemsPrice.get(items.indexOf(i));
                        multipleSelection += " " + selection;
                    }
                }
                System.out.print(total);
            }
        }



        // total






    }
}
