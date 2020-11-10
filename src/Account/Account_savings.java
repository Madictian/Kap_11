package Account;

public class Account_savings extends Account {
    public Account_savings(int id, double balance, double interest) {
        super(id, balance, interest);
    }

    public double withdraw(double balance){
        double amount = 2500;

        if (amount > balance){
            System.out.println("insufficient balance.");
            return balance;
        } else {
            balance = balance - amount;
            return balance;
        }
    }
}
