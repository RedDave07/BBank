
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
    
    Client(String N,String PN,String BT){
        this.Name=N;
        this.PhoneNum=PN;
        this.BloodType=BT;
    }
    
    Client(){}
    
}
class Donor extends Client{
    
    Date Last_donate;
    
    Donor(String N,String PN,String BT,Date last_donate){
        super( N,PN,BT);
        this.Last_donate = last_donate;
    
    }
    
    Donor(){}
    
}
class Recipient extends Client{
    float quantity_needed ;
    
    Recipient(String N,String PN,String BT,float QN){
        super( N,PN,BT);
        this.quantity_needed=QN;
    }
    
    Recipient(){}
}