package Account;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double interest = 0;
    private Date created(){
    Date now = new Date();
        return now;
    }
    public Account(){
    }
    public Account(int id, double balance, double interest) {
        this.id = id;
        this.balance = balance;
        this.interest = interest;
    }

    public double monthlyrate(double balance, double interest){
        double rate = (balance * interest) / balance;
        return rate;
    }
    public double monthlygain(double balance, double interest){
        double gain = (balance * interest) - balance;
        return gain;
    }
    public double withdraw(double balance){
        double amount = 2500;
        balance = balance - amount;
        return balance;
    }
    public double deposit(double balance){
        double amount = 3000;
        balance = amount + balance;
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public static void main(String[] args) {

    }
}
