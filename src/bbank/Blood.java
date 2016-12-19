package bbank;


public abstract class Blood {
    //Donor person;
    double amount;
    int haemoglobin;
    boolean disease;
    
    
    
   Blood (double amount, int haemoglobin, boolean disease){
       this.amount = amount;
       this.haemoglobin = haemoglobin;
       this.disease = disease;
   }
   
   Blood (double amount, boolean disease){
       this.amount = amount;
       this.disease = disease;
   }
   
   Blood (double amount){
       this.amount = amount;
   }
    
   public abstract void setNotifier ();
}

class BloodA extends Blood {
    
    public BloodA(double amount, int haemoglobin, boolean disease) {
        super(amount, haemoglobin, disease);
    }
    public BloodA (double amount, boolean disease){
        super(amount, disease);
    }
    public BloodA (double amount){
        super(amount);
    }

    @Override
    public void setNotifier() {
        
    }
    
}

class BloodB extends Blood {
    
    public BloodB(double amount, int haemoglobin, boolean disease) {
        super(amount, haemoglobin, disease);
    }
    public BloodB (double amount, boolean disease){
        super(amount, disease);
    }
    public BloodB (double amount){
        super(amount);
    }

    @Override
    public void setNotifier() {
        
    }
}

class BloodO extends Blood {
    
    public BloodO(double amount, int haemoglobin, boolean disease) {
        super(amount, haemoglobin, disease);
    }
    public BloodO (double amount, boolean disease){
        super(amount, disease);
    }
    public BloodO (double amount){
        super(amount);
    }

    @Override
    public void setNotifier() {
        
    }
}
