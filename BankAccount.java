public class BankAccount {
    double balance=1000;
    void deposit(int amount)
    {
        balance+=amount;
        showBalance();

    }
    void Withdraw(int amount)
    {
        balance-=amount;
        showBalance();
    }
    double showBalance()
    {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount user1=new BankAccount();
        BankAccount user2=new BankAccount();
        BankAccount user3=new BankAccount();
        System.out.println("User 1 deposits 5000");
        user1.deposit(5000);
        System.out.println("User 1 withdraws 1000 and the final balance is:");
        user1.Withdraw(1000);
        if(user1.showBalance()<0)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println(user1.showBalance());
        }
        System.out.println("User 2 deposits 100");
        user2.deposit(100);
        System.out.println("User 2 withdraws 2500 and the final balance is:");
        user2.Withdraw(2500);
        if(user2.showBalance()<0)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println(user1.showBalance());
        }
        System.out.println("User 3 deposits 1200");
        user3.deposit(1200);
        System.out.println("User 3 withdraws 600 and the final balance is:");
        user3.Withdraw(600);
        if(user3.showBalance()<0)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println(user3.showBalance());
        }
    }

    
}
