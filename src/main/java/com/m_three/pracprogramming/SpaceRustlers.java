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
public class SpaceRustlers {
    public static void main(String[] args)
    {
        int spaceships = 10;
        int aliens =25;
        int cows = 100;
        
        if(aliens>spaceships)
        {
            System.out.println("Vrroom, vroom! Let's get going!");
        }else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");   
        }else if (cows>spaceships){
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here");          
            if(cows > (2*aliens))
                    {
                        System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!") ;  
                    }
            }else{// if we comment this out than it will always apear at end of the code
            System.out.println("Too many ships! Not enough cows. ");
        }

    }
}
