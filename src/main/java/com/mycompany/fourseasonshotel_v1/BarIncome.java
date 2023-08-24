/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fourseasonshotel_v1;

/**
 *
 * @author rasan
 */
public class BarIncome {
    //calling variables from data class
    Data Bdata = new Data();
    
    public double CalcBarIncome(){
       //get value from array and calculate the income
       for (int i = 0; i < Bdata.BarDataArray.length; i++) {
           
           System.out.println("Please Enter the monthly income of : "+ Bdata.BarDataArray[i] );
           Bdata.BarTypeIncome = Bdata.ValidDataDouble();
           Bdata.BarIncomeArray.add(Bdata.BarTypeIncome);
           Bdata.TotBarIncome += Bdata.BarTypeIncome;
           
       }
       
       return Bdata.TotBarIncome;
       
   }
}
