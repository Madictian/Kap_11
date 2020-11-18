package Account;

public class Account_Checking extends Account{
    public Account_Checking(int id, double balance, double interest) {
        super(id, balance, interest);
    }

    public void withdraw(double amount){

        if (amount > this.getBalance() + 300){
            System.out.println("insufficient balance.");
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }
}
