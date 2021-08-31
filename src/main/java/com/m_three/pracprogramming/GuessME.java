/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m_three.pracprogramming;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class GuessME {
    public static void main(String[] args)
    {
        int randomNumber;
        int userNumber;
        Random rng = new Random();
        
        Scanner sc = new Scanner(System.in);
        
        randomNumber= rng.nextInt(10)+1;
        
        System.out.println("Pick a number 1-10: ");
        userNumber = Integer.parseInt(sc.nextLine());
        System.out.println("You entered the value: "+userNumber);
        
        if(userNumber == randomNumber)
            System.out.println("Wow, nice guess! That was it!");
        else if(userNumber<randomNumber)
             System.out.println("Ha, nice try - too low! I chose: "+ randomNumber);
        else
            System.out.println("Too bad, way too high. I chose: " + randomNumber);
        
        
    }
    
}
