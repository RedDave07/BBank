package bbank;

public class BBank {

    public static void main(String[] args) {
       System.out.println("maisnad fuck you"); 


       Recipient r1 = new Recipient ("David","01111231072","A",55);
       Recipient r2 = new Recipient ("Osama","01220006326","B",66);
       ClientDataBase.Recipients_list.add(r1);
       ClientDataBase.Recipients_list.add(r2);
       
              System.out.println("maisnad fuck you"); 

       for(int i=0; i<ClientDataBase.Recipients_list.size(); i++){
           System.out.println(ClientDataBase.Recipients_list.get(i).Name);
       }
//       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
              System.out.println("maisnad fuck you"); 

       ClientDataBase.saveList(ClientDataBase.Recipients_list, "Recipient");
       ClientDataBase.Recipients_list.clear();
//       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
              System.out.println("maisnad fuck you"); 

       ClientDataBase.Recipients_list = ClientDataBase.loadList("Recipient.json");
       System.out.println("Donors size "+ClientDataBase.Recipients_list.size());
       for(int i=0; i<ClientDataBase.Recipients_list.size(); i++){
           System.out.println(ClientDataBase.Recipients_list.get(i).Name);
       }
              System.out.println("maisnad fuck you"); 

//       Window w = new Window();
//       w.setVisible(true);
        
      
       
    }
    
}
