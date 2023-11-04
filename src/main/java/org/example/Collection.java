package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

    public static void main(String args[])
    {
        String[] names = {"ab","cd","ef"};
        ArrayList<String> al = new ArrayList();
        al.add("gh");
        al.add("ij");
        al.add("me");

        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        al.set(1,"megha");
        System.out.println(al);
        //Print the last name into the array list
        System.out.println("Last name is " + al.get(al.size()-1));
        al.add("kaya");
        al.add("Savita");


        // Iterate through the list
        for(int i=0;i<al.size();i++) {

            //System.out.println("Value at index " + i + " "  + al.get(i));

            if(al.get(i).equals("Savita")) {
                System.out.println("Value savita is at index " + i);
            }
        }

        for(String name:al) {

            System.out.println(name);
        }

// Sorting of the data in ascending order
        Collections.sort(al);
        System.out.println(al);

        // Sorting of the data in descending order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
    }


}

