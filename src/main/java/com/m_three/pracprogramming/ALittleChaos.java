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
public class ALittleChaos {
    public static void main(String[] args)
    {
        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);
        double nam = randomizer.nextDouble();

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.print(randomizer.nextInt(51) + ", ");
        System.out.println(randomizer.nextInt(51));
        // if we change randomizer.next int(51) we will get a value 0-50
        System.out.println("random double:"+ nam);
        System.out.println("desisred random number between 0-10 "+ randomizer.nextDouble()* (10));
    }
    
}
