package Account;

public class Account_savings extends Account {
    public Account_savings(int id, double balance, double interest) {
        super(id, balance, interest);
    }

    @Override
    public void withdraw(double amount){

        if (amount > this.getBalance()){
            System.out.println("insufficient balance.");

        } else this.setBalance(this.getBalance() - amount);
    }
}
