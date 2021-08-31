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
public class WaitAWhile {
    public static void main(String[] args)
    {
        int timeNow=5;
        int bedTime=10;
        while(timeNow < bedTime)
        {
            System.out.println("Its only "+ timeNow+ " 0'clock!");
            System.out.println("I think I'll stay up just a litttttle longer......");
            timeNow++;//time passes
        }
        System.out.println("Oh. It's "+timeNow+"o'clock!");
        System.out.println("Guess I should go to bed");
    }
    
}
/*

Q1 what happens if we change the betTime's value to 11 than the loop
will iterate one more time
Q2 if bed time = 10 and time now = 11 then the loop will be skipped
Q3 if you comment out the incrementor it will be an infinit loop


*/