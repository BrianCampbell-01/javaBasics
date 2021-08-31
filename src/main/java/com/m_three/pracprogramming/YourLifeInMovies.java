/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m_three.pracprogramming;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class YourLifeInMovies {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int DoB;
        System.out.println("Hey, lets play a game! Whats your name? ");
        name = sc.nextLine();
        System.out.println("Ok, " + name + ", when where you born? ");
        DoB = Integer.parseInt(sc.nextLine());
        if(DoB<2005)
        {
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }
        if(DoB <1995)
        {
            System.out.println("the first Harry Potter came out over 15 years ago.");
        }
        if(DoB <1985)
        {
             System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        if(DoB < 1975)
        {
            System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");     
        }
        if(DoB < 1965)
        {
            System.out.println("the MASH TV series has been around for almost half a century!");
        }
    }
}
