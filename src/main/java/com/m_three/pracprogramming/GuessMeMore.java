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
public class GuessMeMore {
    public static void main(String[] args)
    {
        int chances = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int value = rand.nextInt(200)-100;
//        for(int i =0; i < 20; i++)
//        {
//            int tmp = rand.nextInt(200)-100;
//            System.out.println("value: "+tmp);
//        }
        
        do{
            System.out.println("Guess the random number: ");
            int userChoice = Integer.parseInt(sc.nextLine());
            if(userChoice == value)
            {
                System.out.println("Good Guess! Your Correct");
                break;                
            }
            else if(userChoice < value)
            {
                System.out.println("Seems you guessed to low");
                chances++;
            }
            else if(userChoice>value)
            {
                System.out.println("Seems you guessed to high");
                chances++;
            }
            if(chances ==2)
            {
                System.out.println("Seeems your out of tries the correct value was: " +value);
            }
        }while(chances < 2);
    }
}
