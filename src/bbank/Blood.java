
package bbank;
import java.util.Date ;

public abstract class Blood {
//    Donor person;
    double amount;
    //int haemoglobin;
    boolean disease;
    Date date;

    // 7attet hena el amount b 0.4 , a3tazer eni bal3ab f class mesh beta3ti - mina wagdi 
   Blood (Date date,boolean disease){
       this.amount = 0.4;
       this.date=date;
       this.disease=disease;
   }
   
   Blood (double amount){
       this.amount = amount;
   }
  
   public void setNotifier (){
       
   }
}

class BloodA extends Blood {
    
    public BloodA(Date date, boolean disease) {
        super(date,disease);
        if(disease){
        BloodStock.total_A_rejected+=amount ;
        }
        else
        BloodStock.total_A_accepted+=amount;
       
    }
    public BloodA (double amount){
        super(amount);
    }
}

class BloodB extends Blood {
    
    public BloodB(Date date, boolean disease) {
        super(date,disease);
                  if(disease){
        BloodStock.total_B_rejected+=amount ;
        }
        
           else BloodStock.total_B_accepted+=amount;
       
    }
    
    public BloodB(double amount){
        super(amount);
    }
 
}

class BloodO extends Blood {
    
    public BloodO(Date date, boolean disease) {
        super(date,disease);
                  if(disease){
        BloodStock.total_O_rejected+=amount ;
        }
        
           else BloodStock.total_O_accepted+=amount;
       
    }
    
    public BloodO(double amount){
        super(amount);
    }
}
