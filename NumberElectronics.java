/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberelectronics;

/**
 *
 * @author Student
 */
public class NumberElectronics {

    public static void main(String[] args) {
    //Declaring array and 2D array
        String []games = {"PSS","XBOX","SWITCH"};
        String []cities={"CAPE TOWN","PORT ELIZABETH","PRETORIA"};
        int[][] sales= {
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}
        };
        
        //Calculating totals
        int highest =0;
       
        
        for(int row=0; row<sales.length;row++)
        {
            int total=0;
            for(int col=0; col<sales[row].length; col++)
            {
                total= total +sales[row][col];
            }
            if(total> highest)
            {
                highest=total;
                
            }
            
         
         //Print totals
          System.out.println("---------------------------------------------");
             System.out.println("GAMING CONSOLE REPORT");
              System.out.println("-------------------------------------------");
             System.out.println("       PSS        XBOX        SWITCH");
              System.out.println( "  "+total);
                 System.out.println();
                  System.out.println("CITY WITH THE MOST SALES: "+highest);
         }
                
            {
        }
    }
    