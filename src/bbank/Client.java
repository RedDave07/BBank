
package bbank;

import java.util.Date;

/**
 *
 * @author ToniGeorge
 */
public abstract class Client {
    String Name ;
    String PhoneNum ;
    String BloodType;
    
    Client(String Name,String phoneNum,String bloodType){
        this.Name = Name;
        this.PhoneNum = phoneNum;
        this.BloodType = bloodType;
    }
    
    Client(){}
    
}
class Donor extends Client{
    
    Date Last_donate;
    
    Donor(String Name,String phoneNum,String bloodType,Date last_donate){
        super(Name,phoneNum,bloodType);
        this.Last_donate = last_donate;
    
    }
    
    Donor(){}
    
}
class Recipient extends Client{
    float quantity_needed ;
    
    Recipient(String Name,String phoneNum,String bloodType,float quantity_needed){
        super( Name,phoneNum,bloodType);
        this.quantity_needed = quantity_needed;
    }
    
    Recipient(){}
}