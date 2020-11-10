package Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    private Account a1;
    private Account a2;

    public void setup(){
        a1 = new Account();
        a2 = new Account();
        a1.setBalance(10000);
        a1.setId(1142);
        a1.setInterest(1.045);

        a2.setBalance(20000);
        a2.setId(1143);
        a2.setInterest(1.045);
    }

    @Test
    void monthlyrate() {
        setup();
        assertEquals(1.045, a1.monthlyrate(a1.getBalance(), a1.getInterest()));
        assertEquals(1.045, a2.monthlyrate(a2.getBalance(), a2.getInterest()));

    }

    @Test
    void monthlygain() {
        setup();
        assertEquals(450, a1.monthlygain(a1.getBalance(), a1.getInterest()));
        assertEquals(900, a2.monthlygain(a2.getBalance(), a2.getInterest()));
    }

    @Test
    void withdraw() {
        setup();
        assertEquals(10000 - 2500, a1.withdraw(a1.getBalance()));
        assertEquals(20000 - 2500, a2.withdraw(a2.getBalance()));

    }

    @Test
    void deposit() {
        setup();
        assertEquals(10000 + 3000, a1.deposit(a1.getBalance()));
        assertEquals(20000 + 3000, a2.deposit(a2.getBalance()));
    }
}