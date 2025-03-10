public abstract class Account
{
     private int accountNumber;
     private double balance;

    public Account(int accountNumber, double balance)
    {   
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
     public int getAccountNumber() 
      {
        return accountNumber;
     }

    public double getBalance() 
      {
         return balance;
      }
    public void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance = balance + amount;
            System.out.print("\n ");                                               
            System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        }
         else 
        {
            System.out.println(" Invalid deposit amount. Please enter a positive value.");
        }
    }
     // Abstract method to withdraw money from the account
     public abstract void withdraw(double amount);

     public void setBalance(double balance) 
    {
        this.balance = balance;
    }

}
     class SavingAccount extends Account
    {
        public SavingAccount(int accountNumber, double balance)
        {
            super(accountNumber, balance);
        }   

        @Override
        public void withdraw(double amount)
        {
            if (amount > getBalance())
            {
                System.out.println("\n Insufficient balance");
            }
            else
            {
                setBalance(getBalance() - amount);            
            }
        }
    }  
    
     class CurrentAccount extends Account
    { 
        public CurrentAccount(int accountNumber, double balance)  /* Constructor */ 
        {
            super(accountNumber, balance);
        }
        @Override
        public void withdraw(double amount)
        {
            if (amount > getBalance())
            {
                System.out.println("\n Insufficient balance");
            }
            else
            {
                setBalance(getBalance() -amount);
            }
        }
    }
     interface BankingOperations {
        // Method to check the balance
        double checkBalance();
    
        // Method to deposit money into the account
        void deposit(double amount);
    
        // Method to withdraw money from the account
        void withdraw(double amount);
    }
     class Bank      // Main class 
     {
        public static void main(String[] args) {
            // SavingsAccount object
            SavingAccount sa = new SavingAccount(12345, 1000.0);
            System.out.println("\n Savings Account Number:" + sa.getAccountNumber());
            System.out.println("\n Initial Savings Account Balance: " + sa.getBalance());

            //  deposit operation on SavingsAccount
            sa.deposit(500.0);

            //  withdrawal operation on SavingsAccount
            sa.withdraw(300.0);
            System.out.println("\n Saving Account Balance :"+sa.getBalance());
    
            System.out.println("\n----------------------------------------------------------------------------");

            //  CurrentAccount object
            CurrentAccount cu = new CurrentAccount(67890, 2000.0);

            System.out.println("\n Current Account Number:" + cu.getAccountNumber());
            System.out.println("\n Initial Current Account Balance: " + cu.getBalance());

            //  deposit operation on CurrentAccount
            cu.deposit(1000.0);

            //  withdrawal operation on CurrentAccount
            cu.withdraw(500.0);
            System.out.println("\n current Current Account Balance :"+cu.getBalance());

        }
    }
    
           
   

