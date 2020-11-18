package Account;

import java.util.ArrayList;
import java.util.Date;

public class Transactions {
    private Date date;
    private Double amount, balance;
    private String description;
    private char type;
    private ArrayList<New_account> list = new ArrayList<>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Transactions(Date date, Double amount, Double balance, String description, char type) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.type = type;
    }


}
