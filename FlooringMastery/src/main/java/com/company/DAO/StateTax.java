/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.DAO;


/**
 *
 * @author User
 */
public class StateTax {
    private String stateCode;
    private String stateName;
    private double stateRate;
    public static Map<String, StateTax> allStateTaxes = new HashMap<>();
    public StateTax(String stateCodeIn, String stateName, double stateRate) {
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.stateRate = stateRate;
        allStateTaxes.put(this.stateCode, this;)
    }
                        

    
   
    
}
