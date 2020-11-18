package Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double interest = 0;
    private double loan_amount = 0;
    private Date created;

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    private ArrayList<Transactions> transactions;

    public Account(){
        name = "";
        id = 0;
        balance = 0;
        interest = 0;
        created = new Date();
        transactions = new ArrayList<Transactions>();
    }
    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        transactions = new ArrayList<Transactions>();
    }
    public Account(int id, double balance, double interest) {
        this.id = id;
        this.balance = balance;
        this.interest = interest;
        transactions = new ArrayList<Transactions>();
    }
    public Account(int id, double balance, double interest, double loan_amount) {
        this.id = id;
        this.balance = balance;
        this.interest = interest;
        this.loan_amount = loan_amount;
        transactions = new ArrayList<Transactions>();
    }



    public double monthlyrate(){
        double rate = (balance * interest) / balance;
        return rate;
    }
    public double monthlygain(){
        double gain = (balance * interest) - balance;
        return gain;
    }
    public void withdraw(double amount){
        balance -= amount;
        transactions.add(new Transactions(amount, balance,"Withdrawal", 'w'));
    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transactions(amount, balance,"Deposit", 'D'));

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        Account account = new Account("george",1122, 1000);

        account.setInterest(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Name: " + account.getName());
        System.out.println("info: " + account.getInterest() + " Balance: " + account.getBalance());


        for (int i = 0; i < account.getTransactions().size(); i++) {

            System.out.println("Date: " + account.getTransactions().get(i).getDate());
            System.out.println("Type: " + account.getTransactions().get(i).getType());
            System.out.println("Amount: " + account.getTransactions().get(i).getAmount());
            System.out.println("On account: " + account.getTransactions().get(i).getBalance());
            System.out.println("Desc: " + account.getTransactions().get(i).getDescription());

        }





    }
}
