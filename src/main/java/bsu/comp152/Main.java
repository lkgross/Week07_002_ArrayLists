package bsu.comp152;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner KEYBOARD = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<String>();
        roster.add("Derek");
        roster.add("Jack");
        roster.add("Roshini");
        roster.add("Zach");
        roster.add("Charles");
        roster.add("Matt");
        System.out.println(roster);
        System.out.println(roster.size());
        System.out.println(roster.get(0));
        System.out.println(roster.contains("Charles"));
        System.out.println(roster.contains("Tim"));
        roster.remove("Eloisa");
        System.out.println(roster);
        roster.add(1, "Charles");
        System.out.println(roster);
        roster.set(1, "Tim");
        System.out.println(roster);
        // We can loop through an ArrayList element-by-element.
        for (String name : roster) {
            System.out.printf("%s (Section 002)\n", name);
        }
        // We can loop through an ArrayList index-by-index.
        System.out.println("What is the index of Roshini in the list?");
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).equals("Roshini")) {
                System.out.printf("The index for Roshini is %d.\n", i);
            }
        }
        System.out.println("What is the index of Charles in the list?");
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).equals("Charles")) {
                System.out.printf("The index for Charles is %d.\n", i);
            }
        }
        System.out.println();
        System.out.println("Welcome to the ArrayList tutorial.");
        System.out.println();
        int choice = 0;
        while (choice != 6) {
            System.out.println("What would you like to do?");
            System.out.println("1- Create an ArrayList");
            System.out.println("2- Add an element to an ArrayList");
            System.out.println("3- Look up an element in an ArrayList");
            System.out.println("4- Print a list of elements in the ArrayList");
            System.out.println("5- Remove an element from the ArrayList");
            System.out.println("6- Exit");
            System.out.println();
            System.out.print("Enter a number 1-6: ");
            choice = KEYBOARD.nextInt();
            // Consumer the newline character.
            KEYBOARD.nextLine();

            switch(choice){
                case 1:
                    System.out.println("You created an ArrayList.");
                    break;
                case 2:
                    System.out.println("You added an element.");
                    break;
                case 3:
                    System.out.println("You found the element.");
                    break;
                case 4:
                    System.out.println("Here is the list of elements.");
                    break;
                case 5:
                    System.out.println("The list is now: " + removeElement(roster));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    /**
     * Removes an element from the ArrayList
     * @param myList the list from which we remove an element
     * @return the ArrayList with the element removed
     */
    private static ArrayList<String> removeElement(ArrayList<String> myList){
        System.out.print("What element do you want to remove? ");
        String element = KEYBOARD.nextLine();
        System.out.printf("You want to remove %s\n", element);
        boolean hasElement = false;
        for (String item : myList){
            if (item.equals(element)){
                hasElement = true;
            }
        }
        /*
         * If the ArrayList does not contain the element to remove, then throw an IllegalArgumentException.
         */
        if (!hasElement){
            throw new IllegalArgumentException("The element is not in the list");
        }
        // Remove the element and return the list without the element.
        myList.remove(element);
        return myList;
    }
}