package Bank_project;

import java.util.Scanner;

import static Bank_project.Database.allAccounts;

public class CityBankATM {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Hello "+"\n"+"Please, enter account number:  ");
        String acc_num=in.next();
        System.out.println("Enter PinCode: ");
        String pinCode=in.next();

        for (BankAccount allAccount : allAccounts) {
            if (allAccount.getAccountNumber().equals(acc_num) && allAccount.getPinCode().equals(pinCode) )
            {
              if(allAccount instanceof CityBankAccount)
              {
                  while(true) {
                      System.out.println(" PRESS [1] TO CASH WITHDRAWAL: " + "\n" + " PRESS [2] TO VIEW BALANCE: ");
                      System.out.println(" PRESS [3] TO CHANGE PIN CODE: " + "\n" + " PRESS [4] TO CASH IN ACCOUNT: ");
                      System.out.println(" PRESS [5] TO VIEW ACCOUNT DATA: " + "\n" + " PRESS [6] TO EXIT: ");
                      int menu = in.nextInt();

                      if(menu==1)
                      {
                          System.out.println("Enter the amount of money you want to withdraw: ");
                          int credit=in.nextInt();
                          allAccount.creditBalance(credit);
                      }
                      else if(menu==2){
                          System.out.println(allAccount.totalBalance());
                      }
                      else if(menu==3){
                          System.out.println("Enter a new pinCode: ");
                          String NewPinCode=in.next();
                          allAccount.setPinCode(NewPinCode);
                      }
                      else if(menu==4){
                          System.out.println("Enter the amount of money you want to withdraw: ");
                          int debet= in.nextInt();
                          allAccount.debetBalance(debet);
                      }
                      else if(menu==5){
                          System.out.println(allAccount.accountData());
                      }
                      else if(menu==6){
                          break;
                      }
                      else{
                          System.out.println("This function does not exist, chose other function: ");
                      }

                  }

              }
              else if(allAccount instanceof NationalBankAccount){
                  while(true) {

                      System.out.println(" PRESS [1] TO CASH WITHDRAWAL " + "\n" + " PRESS [2] TO VIEW BALANCE " + "\n" + " PRESS [3] TO EXIT ");
                      int menu2 = in.nextInt();
                      if (menu2 == 1) {
                          System.out.println("Enter the amount of money you want to withdraw: ");
                          int credit2 = in.nextInt();
                          allAccount.creditBalance(credit2);
                      } else if (menu2 == 2) {
                          System.out.println(allAccount.totalBalance());
                      } else {
                          break;
                      }

                  }

              }
            }

        }

    }
}
