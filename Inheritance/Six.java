/* Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account 
balance falls below one hundred. */

class BankAccount
{
    String accountNumber;
    double balance;
    void deposit()
    {

    }
    void withdraw()
    {

    }
}
class SavingsAccount extends BankAccount
{
    void withdraw()
    {

    }
    public static void main(String[] args)
    {
       SavingsAccount s = new SavingsAccount();
       s.deposit();
       s.withdraw();    
    }
}