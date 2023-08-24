/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fourseasonshotel_v1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rasan
 */
public class Data {
     
    Scanner Input = new Scanner(System.in);
   
    boolean run;
    
    String Ans;
    
    String [] RoomTypesArray = {"Twin Room","Double Room","King Size Room","Family Room"};
    ArrayList<Integer> OccuDataArray = new ArrayList<>();
    double [] RateArray = {194.00,250.00,300.00,450.00};
    String [] BarDataArray = {"Bar","Snacks","Bar Lunch","Bar Dinner"};
    ArrayList<Double> BarIncomeArray = new ArrayList<>();
    String [] ExpensesArray = {"Laundry Costs","Staff Costs- Permanent","Cleaning Costs- Subcontracted","Overheads"};
    ArrayList<Double> TotexpenseArray = new ArrayList<>();
    
    int OccuDates;
    
    double TotRoomIncome;
    
    double BarTypeIncome;
    
    double TotBarIncome;
    
    double GrossIncome;
    
    double Expensetype;
    
    double TotExpenses;
    
    double NetOpProfit;
    
    public int ValidDataInt(){
              
        while (!Input.hasNextInt()) {
            System.out.println("Only decimal numbers are allowed as inputs ! Please enter a valid Input for the previous question.");
            Input.next();
        }
       
        return Input.nextInt();
        
    }
    
    public double ValidDataDouble(){
              
        while (!Input.hasNextDouble()) {
            System.out.println("Only numbers are allowed as inputs ! Please enter a valid Input for the previous question.");
            Input.next();
        }
       
        return Input.nextDouble();
        
    }
    
    public String ValidDataString(){
        return  Input.next();
    }
    
    
    
}
