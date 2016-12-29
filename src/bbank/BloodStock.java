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
    
    public static float total_A_accepted ;
    public static float total_B_accepted ;
    public static float total_O_accepted ;
    public static float total_A_rejected;
    public static float total_B_rejected ;
    public static float total_O_rejected ;
    
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
}
