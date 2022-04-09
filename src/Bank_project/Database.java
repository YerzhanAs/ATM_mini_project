package Bank_project;

import java.util.ArrayList;

public class Database {

    public static ArrayList<BankAccount> allAccounts=new ArrayList<>();


    //public static BankAccount allAccounts[] = new BankAccount[10];

    static{
        /*allAccounts[0] = new CityBankAccount("Bill","Gates",20000,"KZ0103223120102", "0102");
        allAccounts[1] = new CityBankAccount("Steve","Jobs",10000,"KZ010322313", "0101");
        allAccounts[2] = new NationalBankAccount("Arman Armanov",2000,"KZ0101112", "0103");*/
        // Таким образом на ваше усмотрение мы должны заполнить список всех счетов*/
        CityBankAccount cityBankAccount=new CityBankAccount("Bill","Gates",20000,"KZ0103223120102", "0102");
        allAccounts.add(cityBankAccount);
        CityBankAccount cityBankAccount2=new CityBankAccount("Steve","Jobs",10000,"KZ010322313", "0101");
        allAccounts.add(cityBankAccount2);
        NationalBankAccount nationalBankAccount=new NationalBankAccount("Arman Armanov",2000,"KZ0101112", "0103");
        allAccounts.add(nationalBankAccount);
    }

}
