/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fourseasonshotel_v1;

/**
 *
 * @author rasan
 */
public class RoomIncome {
   //calling variables and methods from data class
   Data Rdata = new Data();
   
   public double CalcRoomIncome(){
       //calculate room income
       
       for (int i = 0; i < Rdata.RoomTypesArray.length; i++) { //get value from array and calculate the income
           
           System.out.println("Please Enter "+ Rdata.RoomTypesArray[i] + " occupancy data for the month");
           Rdata.OccuDates=Rdata.ValidDataInt();
           Rdata.OccuDataArray.add(Rdata.OccuDates);
           Rdata.TotRoomIncome += Rdata.OccuDates*Rdata.RateArray[i];
           
       }
       
       return Rdata.TotRoomIncome; //method returns toral room income 
       
   }
    
}
