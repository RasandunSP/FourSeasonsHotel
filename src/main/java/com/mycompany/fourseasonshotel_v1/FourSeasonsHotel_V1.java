/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fourseasonshotel_v1;

/**
 *
 * @author rasan
 */
public class FourSeasonsHotel_V1 {

    public static void main(String[] args) {
        //calling variables from data class
        Data data = new Data();
        data.run = true;
        
        //loop to control exit or restart of the program
        do {            
            //calling room income data from relevent class
            RoomIncome RoomIncome = new RoomIncome();
            //calling bar income data from relevent class
            BarIncome BarIncome = new BarIncome();
            //calling expense data from relevent class
            AllExpenses AllExpenses = new AllExpenses();
            
            //calling the calculation functions on class
            data.TotRoomIncome = RoomIncome.CalcRoomIncome();
            data.TotBarIncome =  BarIncome.CalcBarIncome();
            data.TotExpenses = AllExpenses.CalcTotExpense();
            
            //output the required data
            System.out.println("-------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------");
        
            System.out.println("The Total Income From all rooms is : $ " + data.TotRoomIncome);
            
            System.out.println("The Total Income From the Bar is : $ " + data.TotBarIncome);
            
            data.GrossIncome = data.TotRoomIncome + data.TotBarIncome;
            
            System.out.println("The Gross Income this month is : $ " + data.GrossIncome );
            
            System.out.println("The Total Expenses of this month is : $ " + data.TotExpenses);
            
            data.NetOpProfit = data.GrossIncome-data.TotExpenses;
            
            System.out.println("The Net Operating Profit of this month is : $ " + data.NetOpProfit);
            
            System.out.println("-------------------------------------------------------------------");
            System.out.println("------------------------ END OF REPORT ----------------------------");
            System.out.println("");
            
            //get input for restart or exit
            System.out.println("Do you wish to Redo or Exit the application. Both will result in erasing all entered data above");
            System.out.println("Type 'E' to exit");
            System.out.println("Type 'R' to Redo");
            data.Ans = data.ValidDataString();
            
            //exit or redo function
            switch (data.Ans) {
                case "E" -> System.exit(0);
                case "e" -> System.exit(0);
                case "R" -> {
                    data.run= true;
                    System.out.println("------------------------ RESTARTING APPLICATION ----------------------------");
                    System.out.println("");
                }
                case "r" -> {
                    data.run= true;
                    System.out.println("------------------------ RESTARTING APPLICATION ----------------------------");
                    System.out.println("");
                }
                default -> {
                    System.out.println("Invalid Entry ! Enter E or R ");
                    }                    
                }
            } while (true);   
        
    }
    
}
