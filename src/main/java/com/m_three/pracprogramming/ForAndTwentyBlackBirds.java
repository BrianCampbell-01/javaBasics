/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m_three.pracprogramming;

/**
 *
 * @author Brian
 */
public class ForAndTwentyBlackBirds {
    public static void main(String[] args)
    {
        int birdsInPie = 0;
        for (int i = 1; i < 25; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
    
}
//Q1 changed the value of the conditional to 24
//Q2 two methods set i to 1 and conditional to 25
//second method leave as i as 0 and set condtional to 23 however add i+1 to the print out