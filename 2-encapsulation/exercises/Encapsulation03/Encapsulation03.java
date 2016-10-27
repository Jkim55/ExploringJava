package galvanize;

import encapsulation03_lib.*;

class Encapsulation03 {
  public static void main(String[] args){
    Account sourceAccount = new Account();
    Account destinationAccount = new Account();

    System.out.println(sourceAccount.balance());
    System.out.println(destinationAccount.balance());

    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);
    sourceAccount.deposit(500);
    destinationAccount.deposit(750);

    Transfer t = new Transfer(sourceAccount, destinationAccount);
    t.transfer(250);

    System.out.println(sourceAccount.balance());
    System.out.println(destinationAccount.balance());
  }
}
