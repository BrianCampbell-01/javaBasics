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
public class FizzBuzz {
    public static void main(String[] args)
    {
        int userChoice; int current = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        userChoice = Integer.parseInt(sc.nextLine());
        for(int i =0; current <= userChoice; i++)
        {
            if((i%15)==0)
            {
                System.out.println("fizz buzz");
                current++;
            }
            else if((i%5) == 0)
            {
                System.out.println("buzz");
                current++;
            }
            else if((i%3)==0)
            {
                System.out.println("fizz");
                current++;
            }
            else
            {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!");       
    }  
}
