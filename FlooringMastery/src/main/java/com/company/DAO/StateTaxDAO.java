/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.DAO;
public class StateTaxDAO;
    private String TAXESFILE = "/Data/Taxes.txt";

    public void readTaxes()
{
    File file = new File(TAXESFILE);
    FileReader fr;
    String inputs[]; // array to create object and store values

    try {
        fr new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //reads individula lines
        br.readLine(); //reads a line- need above line or this
        String inputLine = " "; //captures string
        while (inputLine != null){ //while values in file
           inputLine = br.readLine();
           if (inputLine != null) {
           inputs = inputLine.split(","); //splits up into values by , characted
           //marshalls and loads into the above array
                String code = inputs[0];
                String name = inputs[1];
                double rate = Double.parseDouble(inputs[2]);
           //instantiates object. This loads in to map automatically
                 StateTax t = new StateTax(code, name )

           


}
} catch (FileNotFoundException e){
    e.printStackTrace();
} catch (IOException e){
    e.printStackTrace();
}
}
}
/***
 *
 *
 * @author User
 */
public class StateTaxDAO {
    
}
