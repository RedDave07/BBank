package bbank;

import java.util.Date;
import java.util.LinkedList;

public class BBank {
    public static LinkedList <Staff> allStaff = new LinkedList();
    public static void main(String[] args) {
        Staff staff = new Staff("david","123","1","123");
        allStaff.add(staff);
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
        LoginWindow w = new LoginWindow ();
        w.setVisible(true);
//        Window w = new Window();
//        w.setVisible(true);
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
        
        Date d = new Date (2015, 3, 10);
        Date d1 = new Date (2015, 3, 10);
        Date d2 = new Date (2015, 3, 10);
        Date d3 = new Date (2015, 3, 12);
        Date d4 = new Date (2015, 3, 12);
        Date d5 = new Date (2015, 3, 13);

        BloodA b =new BloodA (d, true);
        BloodStock.blood_A.add(b);
        BloodA b1 =new BloodA (d1, false);
        BloodStock.blood_A.add(b1);
        BloodA b2 =new BloodA (d2, true);
        BloodStock.blood_A.add(b2);
        BloodA b3 =new BloodA (d3, false);
        BloodStock.blood_A.add(b3);
        BloodA b4 =new BloodA (d4, false);
        BloodStock.blood_A.add(b4);
        BloodA b5 =new BloodA (d5, false);
        BloodStock.blood_A.add(b5);

        BloodB a =new BloodB (d, false);
        BloodStock.blood_B.add(a);
        BloodB a1 =new BloodB (d1, false);
        BloodStock.blood_B.add(a1);
        BloodB a2 =new BloodB (d2, false);
        BloodStock.blood_B.add(a2);
        BloodB a3 =new BloodB (d3, false);
        BloodStock.blood_B.add(a3);
        BloodB a4 =new BloodB (d4, false);
        BloodStock.blood_B.add(a4);
        BloodB a5 =new BloodB (d5, false);
        BloodStock.blood_B.add(a5);

        BloodO O =new BloodO (d, false);
        BloodStock.blood_O.add(O);
        BloodO O1 =new BloodO (d1, false);
        BloodStock.blood_O.add(O1);
        BloodO O2 =new BloodO (d2, false);
        BloodStock.blood_O.add(O2);
        BloodO O3 =new BloodO (d3, false);
        BloodStock.blood_O.add(O3);
        BloodO O4 =new BloodO (d4, false);
        BloodStock.blood_O.add(O4);
        BloodO O5 =new BloodO (d5, false);
        BloodStock.blood_O.add(O5);
        BloodStock.collectGraphData();
        BloodStock.collect2();
    }
    
}
