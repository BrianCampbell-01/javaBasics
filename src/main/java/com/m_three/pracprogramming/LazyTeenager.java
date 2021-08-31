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
public class LazyTeenager {
    public static void main(String[] args)
    {
       int randValue,timesTold =0;
       Random rand = new Random();
       randValue = rand.nextInt(10)+1;
        do{
            timesTold++;
            if (timesTold==randValue)
            {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
            else if(timesTold == 7)
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
            else
                System.out.println("Clean your room!! (X"+timesTold+")");
        }while(timesTold<7);
    }
    
}
