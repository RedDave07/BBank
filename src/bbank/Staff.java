/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbank;

import java.util.LinkedList;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Staff {
    
    
    public String name;
    public String phoneNumber;
    public String ID;
    public String password;
    
    Staff(String name, String phoneNumber, String ID, String password){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.password = password;
    }
    
    void registerClient()
    {
    }
    boolean checkDonorBloodSample()
    {return true;}
    void ViewStatistics()
    {
        
    }
    void ViewWarnings()
    {}
    boolean checkStockAvailability()
    {
      return true;  
    }
    void ControlStock()
    {
    }
    
            
}
