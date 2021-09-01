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
public class FruitSalad {
    
    
    
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", 
            "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", 
            "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", 
            "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon",
            "Snozzberry"};
      
     
      
        int apples = 0;
        int oranges = 0;
        int total = 0;
        for(String a : fruit)
       {
           if (total >=12)
           {
               break;
           }
           else if( apples <2 && a.contains("Apple") )
            {
               System.out.println(a+" ");
               total++;
               apples++;
            }
           
            else if(oranges <2 && a.contains("Orange")  )
            {
               System.out.println(a+" ");
               total++;
               oranges++;
            }
            else if(a.contains("berry") )
            {
               System.out.println(a+" ");
               total++;
              
            }
            else if(a.contains("Tomato"))
            {
                
            }
       }
        

    }
    
}
