/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronics;

/**
 *
 * @author Student
 */

abstract class Sales {
    
    //Declaring variables
    String deviceType;
    String storeName;
    double totalAmount;
   
   //constructor
     Sales(String deviceType, String storeName, double totalAmount ) {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalAmount = totalAmount;
        
    void bring()
    {