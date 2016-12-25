package bbank;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class ClientDataBase {
    public static LinkedList <Donor> Donors_list = new LinkedList ();
    public static LinkedList <Recipient> Recipients_list = new LinkedList ();
    
    public static void saveList(LinkedList L, String ClientType){
        Gson gson = new Gson ();
        Type type;
        System.out.println("saving to file "+""+ClientType+".json");
        if("Donor".equals(ClientType)){
            type =  new TypeToken<LinkedList<Donor>>() {}.getType();
        }
        else{
            type = new TypeToken<LinkedList<Recipient>>() {}.getType();
        }
        String json = gson.toJson(L, type);
        try{
            FileWriter fw = new FileWriter (""+ClientType+".json");
            fw.write(json);
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static LinkedList loadList (String fileName){
        Gson gson = new Gson ();
        Type type;
        System.out.println("Reading file "+fileName);
        switch (fileName){
            case "Donor.json":
                try{
                    type = new TypeToken<LinkedList<Donor>>() {}.getType();
                    BufferedReader br = new BufferedReader(new FileReader(""+fileName));
                    LinkedList L = new LinkedList ((Collection) gson.fromJson(br, type));
                    return L;
                } 
               catch(Exception e){
                    e.printStackTrace();
                }
                break;
            case "Recipient.json":
                try{
                    type = new TypeToken<LinkedList<Recipient>>() {}.getType();
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
    
    Donor search_Donor (String PhoneNum){
        for(int i=0;i<Donors_list.size();i++){
            if((Donors_list.get(i)).PhoneNum==PhoneNum){
                return Donors_list.get(i) ;
            }
        }
        return new Donor();
    }
    
    Recipient search_Recipient (String PhoneNum){
        for(int i=0;i<Recipients_list.size();i++){
            if((Recipients_list.get(i)).PhoneNum==PhoneNum){
                return Recipients_list.get(i) ;
            }
        }
        return new Recipient();
    }
}
