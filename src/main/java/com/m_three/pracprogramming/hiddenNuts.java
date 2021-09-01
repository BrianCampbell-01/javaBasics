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
public class hiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        
        int index =0;
        for(String s : hidingSpots)
        {
            if(s == "Nut")
            {
                System.out.println("Nut found in position: " + index);
            }
            index++;
        }
        // Nut finding code should go here! 
    }
}
