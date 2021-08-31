/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m_three.pracprogramming;

import java.util.Random;

/**
 *
 * @author Brian
 */
public class BarelyControlledChaos {
     public static void main(String[] args) {

        String color = colorGen(); // call color method here
        String animal = animalGen(); // call animal method again here
        String colorAgain = colorGen(); // call color method again here
        int weight = weightGen(); // call number method,
            // with a range between 5 - 200
        int distance = distanceGen(); // call number method,
            // with a range between 10 - 20
        int number = numberGen(); // call number method,
            // with a range between 10000 - 20000
        int time = timeGen(); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

     public static String colorGen()
     {
        Random rand = new Random();
        String[] colors ={"red","blue","yellow","orange","green"};
        int ranValue = rand.nextInt(5);
        
        return colors[ranValue];
     }
     public static String animalGen()
     {
        Random rand = new Random();
        String[] animals ={"tiger","lion","boar","donkey","shark"};
        int ranValue = rand.nextInt(5);
        
        return animals[ranValue];
     }
     public static int weightGen()
     {
         Random rand = new Random();
         //wieght from 0-196 + 5 = 201 to include 200 and start at 5
         return(rand.nextInt(196)+5);
     }
     public static int distanceGen()
     {
         Random rand = new Random();
         //distance from 0-10 + 10 start with range of 11 and starting value of 10
         return(rand.nextInt(11)+10);
     }
      public static int numberGen()
     {
         Random rand = new Random();
         //range between 10,000 & 20,000 inclusive is 10,001 with a starting value of 10,000
         return(rand.nextInt(10001)+10000);
     }
    public static int timeGen()
     {
         Random rand = new Random();
         // range between 2-6 inclusive is 5 + 2 starting value
         return(rand.nextInt(5)+2);
     }
    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???
}
