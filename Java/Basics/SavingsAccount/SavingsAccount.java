public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  //Check balance:
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+balance);
  }
  
  public void deposit(int amountToDeposit){
    //Deposit:
    int afterDeposit = balance + amountToDeposit;
    balance = afterDeposit;
    System.out.println("You just deposited "+ amountToDeposit);
  }

  public int withdraw(int amountToWithdraw){
    //Withdrawing:
    int afterWithdraw = balance - amountToWithdraw;
    balance = afterWithdraw;
    System.out.println("You just withdrew "+ amountToWithdraw);
    return amountToWithdraw;
  }

  public String toString(){
    return "You account is open!";
  }
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    //Deposit:
    savings.deposit(10000);
    //Withdraw:   
    savings.withdraw(1500);
    savings.checkBalance();

    System.out.println(savings);
  }       
}
