/* Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account 
balance falls below one hundred. */

/*class BankAccount
{
    String accountNumber;
    double balance;
    double amount;

    void deposit()
    {
       balance = balance+amount;
    }
    void withdraw()
    {
       if (balance>=amount)
       {
        balance = balance-amount;
       }
       else
       {
         System.out.println("Insufficient balance");
       }
    }
}
class SavingsAccount extends BankAccount
{
    SavingsAccount(String acc, double bal, double am)
    {
        accountNumber = acc;
        balance = bal;
        amount = am;
    }
    void withdraw()
    {
       if (balance>=amount)
       {
        balance = balance-amount;
       }
       else
       {
         System.out.println("Insufficient balance");
       }
    }
    public static void main(String[] args)
    {
       SavingsAccount s = new SavingsAccount("BA1234",400.0);
       s.deposit(1000.0);
       s.withdraw();    
    }
}*/