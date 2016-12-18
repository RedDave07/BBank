package bbank;

import java.util.LinkedList;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class BloodStock {
    public static LinkedList <BloodA> blood_A = new LinkedList();
    public static LinkedList <BloodB> blood_B = new LinkedList();
    public static LinkedList <BloodO> blood_O = new LinkedList();
    
    public static void saveListToFile (LinkedList L, String bloodType){
        Gson gson = new Gson ();
        System.out.println("saving to file "+""+bloodType+".json");
        String json = gson.toJson(L);
        try{
            FileWriter fw = new FileWriter (""+bloodType+".json");
            fw.write(json);
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static LinkedList loadListFromFile (String fileName){
        Gson gson = new Gson ();
        System.out.println("Reading file "+fileName);
        switch (fileName){
            case "BloodA.json":
                try{
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList <BloodA> L = new LinkedList (gson.fromJson(br, LinkedList.class));
                    return L;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case "BloodB.json":
                try{
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList <BloodB> L = new LinkedList (gson.fromJson(br, LinkedList.class));
                    return L;
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case "BloodO.json":
                try{
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList <BloodO> L = new LinkedList (gson.fromJson(br, LinkedList.class));
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
