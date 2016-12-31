package bbank;

import java.util.LinkedList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;

public class BloodStock {
    public static LinkedList <BloodA> blood_A = new LinkedList();
    public static LinkedList <BloodB> blood_B = new LinkedList();
    public static LinkedList <BloodO> blood_O = new LinkedList();
    
    public static LinkedList  QuantityGraph = new LinkedList();
    public static LinkedList  DateGraph = new LinkedList();
    
    public static LinkedList  accepted_A = new LinkedList();
    public static LinkedList  accepted_B = new LinkedList();
    public static LinkedList  accepted_O = new LinkedList();
    public static LinkedList  Accepted_Date_A = new LinkedList();
    public static LinkedList  Accepted_Date_B = new LinkedList();
    public static LinkedList  Accepted_Date_O = new LinkedList();
    public static LinkedList  rejected_A = new LinkedList();
    public static LinkedList  rejected_B = new LinkedList();
    public static LinkedList  rejected_O = new LinkedList();
    public static LinkedList  rejected_Date_A = new LinkedList();
    public static LinkedList  rejected_Date_B = new LinkedList();
    public static LinkedList  rejected_Date_O = new LinkedList();
    
    public static double total_A_accepted = 0;
    public static double total_B_accepted = 0;
    public static double total_O_accepted = 0;
    public static double total_A_rejected = 0;
    public static double total_B_rejected = 0;
    public static double total_O_rejected = 0;
    
    
    
    public static void saveListToFile (LinkedList L, String bloodType){
        Gson gson = new Gson ();
        System.out.println("saving to file "+""+bloodType+".json");
        Type type;
        if("BloodA".equals(bloodType)){
            type =  new TypeToken<LinkedList<BloodA>>() {}.getType();
        }
        else if("BloodB".equals(bloodType)){
            type =  new TypeToken<LinkedList<BloodB>>() {}.getType();
        }
        else{
            type =  new TypeToken<LinkedList<BloodO>>() {}.getType();
        }
        String json = gson.toJson(L, type);
        try{
            FileWriter fw = new FileWriter (""+bloodType+".json");
            fw.write(json);
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static LinkedList loadListFromFile ( String fileName){
        Gson gson = new Gson ();
        Type type;
        System.out.println("Reading file "+fileName);
        switch (fileName){
            case "BloodA.json":
                try{
                    type =  new TypeToken<LinkedList<BloodA>>() {}.getType();
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList L = new LinkedList ((Collection) gson.fromJson(br, type));
                    return L;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case "BloodB.json":
                try{
                    type =  new TypeToken<LinkedList<BloodB>>() {}.getType();
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList  L = new LinkedList ((Collection) gson.fromJson(br, type));
                    return L;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case "BloodO.json":
                try{
                    type =  new TypeToken<LinkedList<BloodO>>() {}.getType();
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList L = new LinkedList ((Collection) gson.fromJson(br, type));
                    return L;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;    
        }
        return new LinkedList();
    }
    
    public static void CalculateTotalBlood (){
        for(int i=0; i<blood_A.size(); i++){
            if(blood_A.get(i).disease == true)
                total_A_rejected += blood_A.get(i).amount;
            else 
                total_A_accepted += blood_A.get(i).amount;
        }
        for(int i=0; i<blood_B.size(); i++){
            if(blood_B.get(i).disease == true)
                total_B_rejected += blood_B.get(i).amount;
            else 
                total_B_accepted += blood_B.get(i).amount;
        }
        for(int i=0; i<blood_O.size(); i++){
            if(blood_O.get(i).disease == true)
                total_O_rejected += blood_O.get(i).amount;
            else 
                total_O_accepted += blood_O.get(i).amount;
        }
        System.out.println("total A accepted: "+ total_A_accepted);
        System.out.println("total A rejected: "+ total_A_rejected);
        System.out.println("total B accepted: "+ total_B_accepted);
        System.out.println("total B rejected: "+ total_B_rejected);
        System.out.println("total O accepted: "+ total_O_accepted);
        System.out.println("total O rejected: "+ total_O_rejected);
    }
    
    static void collectGraphData(int blood){
       QuantityGraph.clear();
       DateGraph.clear();
       
       switch (blood){
           case 0:
               double quantity_A=0;
               for (int i=0;i<blood_A.size();i++){
                   quantity_A=(blood_A.get(i)).amount;
                   for(int j=0;j<blood_A.size();j++){
                       if(blood_A.get(i).date.getDay()==(blood_A.get(j).date.getDay())
                               && blood_A.get(i).date.getMonth()==(blood_A.get(j).date.getMonth())
                               && j>i){  
                           i++;
                           quantity_A= quantity_A+(blood_A.get(j)).amount;
                       }
                   }
                   QuantityGraph.add(quantity_A);
                   DateGraph.add(blood_A.get(i).date);
               }
               for(int k=0 ;k<QuantityGraph.size();k++){
                   System.out.println("QuantityA : "+QuantityGraph.get(k)+" Date : "+DateGraph.get(k));
               }
               for(int l=0;l<QuantityGraph.size();l++){
                   int m =l-1 ;
                   if (m>=0){
                       double Quant =( (double)QuantityGraph.get(l)+(double)QuantityGraph.get(m));
                       QuantityGraph.remove(l);
                       QuantityGraph.add(l,Quant);
                   }
               }
               for(int k=0 ;k<QuantityGraph.size();k++){
                   System.out.println("QuantityA : "+QuantityGraph.get(k)+" Date : "+DateGraph.get(k));
               }
               break;
               
           case 1:
               double quantity_B=0;
               for (int i=0;i<blood_B.size();i++){
                   quantity_B=(blood_B.get(i)).amount;
                   for(int j=0;j<blood_B.size();j++){
                       if(blood_B.get(i).date.getDay()==(blood_B.get(j).date.getDay())
                               && blood_B.get(i).date.getMonth()==(blood_B.get(j).date.getMonth())
                               && j>i){  
                           i++;
                           quantity_B= quantity_B+(blood_B.get(j)).amount;
                       }
                   }
                   QuantityGraph.add(quantity_B);
                   DateGraph.add(blood_B.get(i).date);
               }
               for(int k=0 ;k<QuantityGraph.size();k++){
                   System.out.println("QuantityB : "+QuantityGraph.get(k)+" Date : "+DateGraph.get(k));
               }
               for(int l=0;l<QuantityGraph.size();l++){
                   int m =l-1 ;
                   if (m>=0){
                       double Quant =( (double)QuantityGraph.get(l)+(double)QuantityGraph.get(m));
                       QuantityGraph.remove(l);
                       QuantityGraph.add(l,Quant);
                   }
               }
               for(int k=0 ;k<QuantityGraph.size();k++){
                   System.out.println("QuantityB : "+QuantityGraph.get(k)+" Date : "+DateGraph.get(k));
               }
               break;
               
           case 2:
               double quantity_O=0;
               for (int i=0;i<blood_O.size();i++){
                   quantity_O=(blood_O.get(i)).amount;
                   for(int j=0;j<blood_O.size();j++){
                       if(blood_O.get(i).date.getDay()==(blood_O.get(j).date.getDay())
                               && blood_O.get(i).date.getMonth()==(blood_O.get(j).date.getMonth())
                               && j>i){  
                           i++;
                           quantity_O= quantity_O+(blood_O.get(j)).amount;
                       }
                   }
                   QuantityGraph.add(quantity_O);
                   DateGraph.add(blood_O.get(i).date);
               }
        //       for(int l=0;l<Quantity_O.size();l++){
        //           for(int m =l-1;m>=0;m--){
        //               double Quant =( (double)Quantity_O.get(l)+(double)Quantity_O.get(m));
        //               Quantity_O.remove(l);
        //               Quantity_O.add(l,Quant);
        //           }
        //       }
               for(int k=0 ;k<QuantityGraph.size();k++){
                   System.out.println("QuantityO : "+QuantityGraph.get(k)+" Date : "+DateGraph.get(k));
               }
               for(int l=0;l<QuantityGraph.size();l++){
                   int m =l-1 ;
                   if (m>=0){
                       double Quant =( (double)QuantityGraph.get(l)+(double)QuantityGraph.get(m));
                       QuantityGraph.remove(l);
                       QuantityGraph.add(l,Quant);
                   }
               }
               for(int k=0 ;k<QuantityGraph.size();k++){
                   System.out.println("QuantityO : "+QuantityGraph.get(k)+" Date : "+DateGraph.get(k));
               }
               break;
       }
       
       
       
    }
    
    static void collect2(){
       float Accepted_quantity_A=0;
       float Rejected_quantity_A=0;
   for (int i=0;i<blood_A.size()-1;i++){
      int j=i+1 ;
//          Accepted_quantity_A=(float)(blood_A.get(i)).amount;
//       for(int j=0;j<blood_A.size();j++){
           if( blood_A.get(i).disease == false){
       if(blood_A.get(i).date.getDay()==(blood_A.get(j).date.getDay())
               && blood_A.get(i).date.getMonth()==(blood_A.get(j).date.getMonth())
               && j>i  )
       {  
           i++;
          Accepted_quantity_A= Accepted_quantity_A+(float)(blood_A.get(i)).amount;
       
       }
       
       
       
       accepted_A.add(Accepted_quantity_A);
       Accepted_Date_A.add(blood_A.get(i).date);
           }
           else if(blood_A.get(i).disease == true){   
                  if(blood_A.get(i).date.getDay()==(blood_A.get(j).date.getDay())
               && blood_A.get(i).date.getMonth()==(blood_A.get(j).date.getMonth())
               && j>i  )
       {  
           i++;
          Rejected_quantity_A= Rejected_quantity_A+(float)(blood_A.get(j)).amount;
       
       }
       
       
       
       rejected_A.add(Rejected_quantity_A);
       rejected_Date_A.add(blood_A.get(i).date);
           
           }
//           }
   }
     for(int k=0 ;k<accepted_A .size();k++){
       System.out.println("accepted_A : "+accepted_A .get(k)+" Date : "+Accepted_Date_A.get(k));
       
   }
        for(int k=0 ;k<rejected_A.size();k++){
       System.out.println("rejected_A : "+rejected_A .get(k)+" Date : "+rejected_Date_A.get(k));
       
   }
      for(int l=1;l<rejected_A.size()-1;l++){
       
   int m =l-1 ;
  
      
   float Quant2 = ((float)accepted_A.get(l)+(float)accepted_A.get(m));
    accepted_A .remove(l);
     accepted_A .add(l,Quant2);
   
   }
           for(int k=0 ;k<accepted_A .size();k++){
       System.out.println("accepted_A : "+accepted_A .get(k)+" Date : "+Accepted_Date_A.get(k));
   }
                for(int k=0 ;k<rejected_A.size();k++){
       System.out.println("rejected_A : "+rejected_A .get(k)+" Date : "+rejected_Date_A.get(k));
       
   }
    }
   
}
