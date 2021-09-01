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
public class Factorizer {
    public static void main(String[] args)
    {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to factor: ");
        int userInput = Integer.parseInt(sc.nextLine());
        
        
        //show original value
        System.out.println("You enetered the value: "+ userInput);
        //print each factor of the value
        int[] arr = new int[userInput+1];
        int min = 0;
        int max = arr.length-1;
        int factors=0;
        
        //populate array
        int counter = 0;
        for(int i= 0; i< userInput+1; i++)
        {
            arr[i]=counter++;
        }
        for(int i : arr)
        {
            System.out.println(i);
        }
        //print the total number of factors
        while(min <= max)
        {
            if((arr[min] * arr[max]) == userInput)
            {
                System.out.println(arr[min] + " * " + arr[max] + " = " + userInput);
                factors++;
                max--;
                min++;
            }
            else if((arr[min] * arr[max])> userInput)
            {
                max--; 
            }
                
            else if((arr[min]*arr[max])< userInput)
            {
                 min++;
            }
                 
        }
        
        //the program must print out wheter or no the number is perfect 
        System.out.println(userInput+ " has "+ factors + " factors");
        
        if(factors > 0)
        {
            System.out.println(userInput+ " is a perfect number");
            System.out.println(userInput+ " is not a prime number");
        }
            
        else
        {
            System.out.println(userInput+ " is not a perfect number");
            System.out.println(userInput+ " is a prime number");
        }
        
        
    }
    
}
