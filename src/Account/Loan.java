package Account;

import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Loan {
    static ArrayList loaners = new ArrayList();


    public static void main(String[] args) {
        Account john = new Account(5234, 354, 0.05, 10000);
        Date d1 = new Date();
        String bah = "bah";

        loaners.add(john);
        loaners.add(d1);
        loaners.add(bah);


        for (int i = 0; i <= loaners.size() - 1; i++) {
            System.out.println(loaners.get(i).toString());
        }

    }
}
