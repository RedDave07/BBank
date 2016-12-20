package bbank;

public class BBank {

    public static void main(String[] args) {
       Window w = new Window();
       w.setVisible(true);
        
       //example for running client data base on the recipients list
       Recipient r1 = new Recipient ("David","01111231072","A");
       Recipient r2 = new Recipient ("Osama","01220006326","B");
       ClientDataBase.Recipients_list.add(r1);
       ClientDataBase.Recipients_list.add(r2);
       
       for(int i=0; i<ClientDataBase.Recipients_list.size(); i++){
           System.out.println(ClientDataBase.Recipients_list.get(i).Name);
       }
       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
       
       ClientDataBase.saveList(ClientDataBase.Recipients_list, "Recipient");
       ClientDataBase.Recipients_list.clear();
       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
       
       ClientDataBase.Recipients_list = ClientDataBase.loadList("Recipient.json");
       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
       for(int i=0; i<ClientDataBase.Recipients_list.size(); i++){
           System.out.println(ClientDataBase.Recipients_list.get(i).Name+" "+ClientDataBase.Recipients_list.get(i).BloodType+" "+ClientDataBase.Recipients_list.get(i).PhoneNum);
       }
       
    }
    
}
