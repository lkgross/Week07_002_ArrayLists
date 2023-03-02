package bsu.comp152;
import com.sun.source.doctree.SystemPropertyTree;

import java.util.ArrayList;

public class Main {
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
        roster.remove("Charles");
        System.out.println(roster);
        roster.add(1, "Charles");
        System.out.println(roster);
        roster.set(1, "Tim");
        System.out.println(roster);
        // We can loop through an ArrayList element-by-element.
        for (String name : roster){
            System.out.printf("%s (Section 002)\n", name);
        }
        // We can loop through an ArrayList index-by-index.
        System.out.println("What is the index of Roshini in the list?");
        for (int i = 0; i < roster.size(); i++){
            if (roster.get(i).equals("Roshini")){
                System.out.printf("The index for Roshini is %d.\n", i);
            }
        }
        System.out.println("What is the index of Charles in the list?");
        for (int i = 0; i < roster.size(); i++){
            if (roster.get(i).equals("Charles")){
                System.out.printf("The index for Charles is %d.\n", i);
            }
        }



    }
}