/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fourseasonshotel_v1;

/**
 *
 * @author rasan
 */
public class AllExpenses {
    //calling variables from data class
    Data Edata = new Data();
    
    public double CalcTotExpense(){
       //get value from array and calculate the expense
       for (int i = 0; i < Edata.ExpensesArray.length; i++) {
           
           System.out.println("Please Enter the monthly expense of : "+ Edata.ExpensesArray[i] );
           Edata.Expensetype = Edata.ValidDataDouble();
           Edata.TotexpenseArray.add(Edata.Expensetype);
           Edata.TotExpenses += Edata.Expensetype;    
           
       }
       
       return Edata.TotExpenses;
       
   }
    
}
