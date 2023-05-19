/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

/**
 *
 * @author User
 */
public class Runner {
    public static boolean isInvalidState = false;
    public static void main(String args[])
    {
        StateTaxDAO stateTaxDAO = new StateTaxDAO();
        StateTaxDAO.readTaxes();
    do {   
        System.out.println(StateTax.allStateTaxes);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the state Code  "); 
        String stateCode= inputIn.next();
        try{
            StateTax aStateTax = StateTax.allStateTaxes.get(stateCode);
        System.out.println(aStateTax.getStateRate() + "is "+ aStateTax.getStateName() + "rate");
    }
        }
        catch (NullPointerException e)
        {
            System.out.println("Invalid State Code ")
    }
    
}
