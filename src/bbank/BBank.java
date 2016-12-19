package bbank;

public class BBank {

    public static void main(String[] args) {
       System.out.println("5OD _|_ ya toni");
       BloodA a1 = new BloodA(5);
       BloodA a2 = new BloodA(8);
       BloodStock.blood_A.add(a1);
       BloodStock.blood_A.add(a2);
       for(int i=0; i<BloodStock.blood_A.size(); i++){
           System.out.println("Blood A: "+BloodStock.blood_A.get(i).amount);
       }
       System.out.println("Stock size "+BloodStock.blood_A.size());
       
       BloodStock.saveListToFile(BloodStock.blood_A, "BloodA");
       BloodStock.blood_A.clear();
       System.out.println("Stock size "+BloodStock.blood_A.size());
       
       BloodStock.blood_A = BloodStock.loadListFromFile("BloodA.json");
       System.out.println("Stock size "+BloodStock.blood_A.size());
       for(int i=0; i<BloodStock.blood_A.size(); i++){
           System.out.println("Blood A: "+BloodStock.blood_A.get(i).amount);
       }
       
    }
    
}
