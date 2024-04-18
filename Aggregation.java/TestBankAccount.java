// Abstract class representing generic bank account 
abstract class BankAccount
{
      double balance;
	  //Constructor 
	   BankAccount(double balance)
	  {
	       this.balance = balance;
	  }
	  // Abstract method to deposit money 
	   public abstract void deposit(double amount); 
	  // Abstract method to withdraw money 
	   public abstract void withdraw(double amount); 
	  // Concrete method to check balance 
	    double getBalance()
	  {
	        return balance; 
	  }	  
}

 class SavingsAccount extends BankAccount
{
       double interestRate;
	   
	   //Constructor 
	    SavingsAccount(double balance, double interestRate)
	   {
	         super(balance);
			 this.interestRate = interestRate; 
	   }
       // Implement Depoist method 
	    public void deposit(double amount)
	   {
	          balance += amount; 
	   }
	      // Implement Withdraw method 
	     public void withdraw(double amount)
	   {
	          balance -= amount; 
	   }
	   // Method to calculate interestRate
	     void calculateInterest()
	   {
	          double interest = balance * interestRate / 100;
			  balance += interest; 
	   }
}
  class CheckingAccount extends BankAccount
{
         double limit;
		 //constructor 
		  CheckingAccount(double balance, double limit)
		 {
		      super(balance); 
			  this.limit = limit;
		 }
		 // Implement Depoist method 
	     public void deposit(double amount)
	   {
	          balance += amount; 
	   }
	       // Implement Withdraw method  
	     public void withdraw(double amount)
	   {
	         if (balance - amount >= limit)
	         {
         			 balance -= amount; 
		     }
              else
              {
                     System.out.println("Withdrawal amount exceeds limit!");
              }			  
	   }
}
  class TestBankAccount
{
      public static void main(String args[])
	  {      // Create a savings account and deposit money 
 	          SavingsAccount sa = new SavingsAccount(1000,5);
			  sa.deposit(500);
			  System.out.println("SAvings account balance: "+sa.getBalance());
			  // Create checking account and withdraw money 
			  CheckingAccount ca = new CheckingAccount(2000,1000);
			  ca.withdraw(1500);
			  System.out.println("Checking account balance: "+ca.getBalance());			  
	  }
} 
/* 
 1. We define abstract class BankAccount with abstract methods deposit() and withdraw() to represent common behaviour to all types of bankaccount

 2. We have concrete classes SavingsAccount and CheckingAccount that extends BankAccount and provide their own implementations of the deposit and withdraw
      methods. 

 3. Each Concerete class can have its own unique behaviour such as calculating interset for savings account or limit protection of checking account. 

 4. In the Main class TestBankAccount we create instances of SavingsAccount and CheckingAccount treating them as BankAccount objects. We can deposit or withdraw money from these acounts without needing to know the specific details of each account types implementation.  
*/