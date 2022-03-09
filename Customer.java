package Assignment;

import java.util.*;
public class Customer {
 public static void main(String[] args) {
  try {
   Scanner sc = new Scanner(System.in);
   ICICIBank acc = new ICICIBank();
   String option = "";
   do {
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Balance Enquiry");
    System.out.println("Enter option");
    option = sc.next();
    switch(option) {
     case "1":
     {
      System.out.println("Enter Deposit Amount");
      double amt = sc.nextDouble();
      acc.deposite(amt);
      acc.balanceEnquiry();
      break;
     }
     case "2":
     {
      System.out.println("Enter Withdraw Amount");
      double amt = sc.nextDouble();
      double wd = acc.withdraw(amt);
    System.out.println("Withdraw Amount is :" + wd);
      acc.balanceEnquiry();
      break;
     }
     case"3":
     {
      acc.balanceEnquiry();
      break;
     }
     default:
      System.out.println("Invalid Option");
    }
    System.out.println("Do you want to Continue (Yes/No)");
    option = sc.next();
   }while(option.equalsIgnoreCase("Yes"));
  }
  catch(InvalidAmountException iae)
  {
   System.out.println(iae.getMessage());
  }
  catch(InsufficientFundsException ife)
  {
   System.out.println(ife.getMessage());
  }
  catch(NumberFormatException nfe)
  {
   System.out.println(nfe.getMessage());
  }
 }
}