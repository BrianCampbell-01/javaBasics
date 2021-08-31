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
public class MiniZork {
    public static void main()
    {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { }
        } 
        else if (action.equals("go to the house")) { 
            System.out.println("Once you arrive at the house you notice a glisten in the window");
            System.out.println("As you peer closer to the window, you notice a figure quickly move out of sight");
            System.out.println("Go to the Door, or continue down the road?");
            action = userInput.nextLine();
            if(action.equals("Go to the Door"))
            {
                System.out.println("As you approach the door you hear small whispers.");
                System.out.println("You can tell someone is pearing through the door hole at you");
                System.out.println("Knock on door or  turn away");
                action= userInput.nextLine();
                if(action.equals("Knock on door"))
                {
                    System.out.println("Well it seems that you have perished, did you not notice the signs?");
                }
                else if(action.equals("turn away"))
                {
                    System.out.println("You hear slamming on the door as you walk away, somthing seems angry at your choice");
                    System.out.println("As you continue down the road you meet an old drunk who begins to tell tales of a house");
                    System.out.println("A house so horrible that all who enter at the calls of whispers perish, Seems you made the right choice");
                }
            }
            else if(action.equals("continue down the road"))
            {
                System.out.println("As you leave you notice that most people in this part of town seem worried and afraid yet unable to leavee");
                System.out.println("they look at you in envy as you leave the town, Guess it was better to not let curriostiy get the better of ones self");
            }
        }
    }
    
}
