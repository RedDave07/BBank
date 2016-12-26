package bbank;

import java.util.Date;

public class BBank {

    public static void main(String[] args) {
//       Recipient r1 = new Recipient ("David","01111231072","A",55);
//       Recipient r2 = new Recipient ("Osama","01220006326","B",66);
//       ClientDataBase.Recipients_list.add(r1);
//       ClientDataBase.Recipients_list.add(r2);
//
//       for(int i=0; i<ClientDataBase.Recipients_list.size(); i++){
//           System.out.println(ClientDataBase.Recipients_list.get(i).Name);
//       }
//       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
//
//       ClientDataBase.saveList(ClientDataBase.Recipients_list, "Recipient");
//       ClientDataBase.Recipients_list.clear();
//       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
//
//       ClientDataBase.Recipients_list = ClientDataBase.loadList("Recipient.json");
//       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
//       for(int i=0; i<ClientDataBase.Recipients_list.size(); i++){
//           System.out.println(ClientDataBase.Recipients_list.get(i).Name);
//       }

        Window w = new Window();
        w.setVisible(true);
//        Donor d = new Donor("hakuna matata" , "01117060271" , "A" , new Date(2012 , 5 , 2));
//        Donor d2 = new Donor("davidToni" , "01220872006" , "O" , new Date(2013 , 5 , 2));
        ClientDataBase.Donors_list = ClientDataBase.loadList("Donor.json");
//        ClientDataBase.Donors_list.add(d);
//        ClientDataBase.Donors_list.add(d2);
//        ClientDataBase.saveList(ClientDataBase.Donors_list, "Donor");
        ClientDataBase.Recipients_list = ClientDataBase.loadList("Recipient.json");
        BloodStock.blood_A = BloodStock.loadListFromFile("BloodA.json");
        BloodStock.blood_B = BloodStock.loadListFromFile("BloodB.json");
        BloodStock.blood_O = BloodStock.loadListFromFile("BloodO.json");
        
        
        
        
    }
    
}
