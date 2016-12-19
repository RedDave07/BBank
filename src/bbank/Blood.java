package bbank;


public abstract class Blood {
//    Donor person;
    double amount;
    int haemoglobin;
    boolean disease;
//    Date date;
    
    
   Blood (double amount, int haemoglobin){
       this.amount = amount;
       this.haemoglobin = haemoglobin;
   }
   
   Blood (double amount){
       this.amount = amount;
   }
    
   public void setNotifier (){
       
   }
}

class BloodA extends Blood {
    
    public BloodA(double amount, int haemoglobin, boolean disease) {
        super(amount, haemoglobin);
    }
    public BloodA (double amount){
        super(amount);
    }
}

class BloodB extends Blood {
    
    public BloodB(double amount, int haemoglobin) {
        super(amount, haemoglobin);
    }
    public BloodB(double amount){
        super(amount);
    }
}

class BloodO extends Blood {
    
    public BloodO(double amount, int haemoglobin) {
        super(amount, haemoglobin);
    }
    public BloodO(double amount){
        super(amount);
    }
}
