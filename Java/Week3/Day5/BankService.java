
public class BankService {
    private double balance;//The balance should be kept private. If it were public, then other developers could write code in other classes that could cause the balance to exhibit unintended behavior, like being negative. The private access modifier will allow only the methods within this class to interact with the balance.
    public BankService(){//A constructor to build a BankService object that will start the bank balance at 0.
        this.balance = 0;
    }
    public void deposit(double amount){//implement functionality to increase the user's balance by amount.
        balance=balance+amount;
    }
    public void withdraw(double amount){//implement functionality to decrease the user's balance by an amount.
        if(!(amount>balance)){
            balance=balance-amount;
        }
    }
    public double getBalance(){//return the balance.
        return this.balance;
    }
    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.deposit(1000);
        System.out.println("Current balance: " + bankService.getBalance());
        bankService.withdraw(500);
        System.out.println("Current balance after withdrawal: " + bankService.getBalance());
        bankService.withdraw(1500);
        System.out.println("Current balance after withdrawal: " + bankService.getBalance());
    }
}