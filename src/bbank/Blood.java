package bbank;

import java.util.Date;


public abstract class Blood {
    //Donor person;
    double amount;
    int haemoglobin;
    Date date;
    
    
   Blood (double amount, int haemoglobin, Date date){
       this.amount = amount;
       this.haemoglobin = haemoglobin;
       this.date = date;
   }
   
   Blood (double amount, Date date){
       this.amount = amount;
       this.date = date;
   }
    
   public void setNotifier (){
       
   }
}

class BloodA extends Blood {
    
    public BloodA(double amount, int haemoglobin, boolean disease, Date date) {
        super(amount, haemoglobin, date);
    }
    public BloodA (double amount, Date date){
        super(amount, date);
    }
    
}

class BloodB extends Blood {
    
    public BloodB(double amount, int haemoglobin, Date date) {
        super(amount, haemoglobin, date);
    }
    public BloodB(double amount, Date date){
        super(amount, date);
    }


}

class BloodO extends Blood {
    
    public BloodO(double amount, int haemoglobin, Date date) {
        super(amount, haemoglobin, date);
    }
    public BloodO(double amount, Date date){
        super(amount, date);
    }


}
