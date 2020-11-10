package Account;

public class Main {
    public static void main(String[] args) {


        Account yes = new Account(5371, 30000, 0.06);
        Account_Checking yep = new Account_Checking(5371, 30000, 0.06);
        Account_savings ayup = new Account_savings(4235, -300, 0.05);
        System.out.println("normal: " + yes.toString());
        System.out.println("Savings: " + yep.toString());
        System.out.println("Checking: " + ayup.toString());
    }
}
