
package bbank;

/**
 *
 * @author ToniGeorge
 */
public abstract class Client {
    String Name ;
    String PhoneNum ;
    Blood BloodType;
    Client(String N,String PN,Blood BT){
    this.Name=N;
    this.PhoneNum=PN;
    this.BloodType=BT;
    }
    
public void Request(){
    
    
}
public void GetBloodInformation(){
    switch(BloodType.getClass().getName()){
        case "BloodA":
             System.out.println("Blood Type : A");
            break;
        case "BloodB":
             System.out.println("Blood Type : B");
            break;
        case "BloodO":
             System.out.println("Blood Type : O");
            break;
            
    }
    System.out.println("amount: "+BloodType.amount+" "+"accepted: "+BloodType.disease+" "+"haemoglobin: "+BloodType.haemoglobin);

}
}
class Donor extends Client{
    Boolean diseases ;
    Donor(String N,String PN,Blood BT,Boolean diseases){
    super( N,PN,BT);
    this.diseases=diseases;
    }



}
class Recipient extends Client{
   float quantity_needed ;
    Recipient(String N,String PN,Blood BT,float QN){
    super( N,PN,BT);
    this.quantity_needed=QN;
    }



}