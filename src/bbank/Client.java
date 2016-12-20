
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
    
    Client(String Name,String phoneNumber,String BloodType){
        this.Name = Name;
        this.PhoneNum = phoneNumber;
        this.BloodType = BloodType;
    }
    
}
class Donor extends Client{
    Date Last_donate;
    
    Donor(String Name,String phoneNumber,String BloodType, Date last_donate){
        super(Name, phoneNumber, BloodType);
        this.Last_donate = last_donate;
    }
    Donor (String Name,String phoneNumber,String BloodType){
        super(Name, phoneNumber, BloodType);
    }

}
class Recipient extends Client{
    float quantity_needed ;
    
    Recipient(String Name,String phoneNumber,String BloodType,float QuantityNeeded){
        super(Name, phoneNumber, BloodType);
        this.quantity_needed = QuantityNeeded;
    }
    Recipient(String Name,String phoneNumber,String BloodType){
        super(Name, phoneNumber, BloodType);
    }

}